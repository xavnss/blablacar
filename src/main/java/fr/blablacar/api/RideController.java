package fr.blablacar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.blablacar.dao.RideRepository;
import fr.blablacar.dao.UserRepository;
import fr.blablacar.domain.Ride;
import fr.blablacar.domain.User;

@RestController
@RequestMapping("/ride")
public class RideController {

	@Autowired
	private RideRepository rideRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("{idRide}")
	public Ride find(@PathVariable("idRide") Long rideId) {
		return rideRepository.findOne(rideId);
	}
	
	@GetMapping
	public Iterable<Ride> findAll(){
		return rideRepository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody Ride ride) {
		System.out.println("save | ride " + ride.toString());
		User user = userRepository.findOne(ride.getUserWhoProposed());
		if(user == null){
			System.out.println("Utilisateur non trouvé -> abandon");
			return;
		}
		user.addARide(ride);
		rideRepository.save(ride);
		userRepository.save(user);
	}
}
