package fr.blablacar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.blablacar.dao.RideRepository;
import fr.blablacar.domain.Ride;

@RestController
@RequestMapping("/ride")
public class RideController {

	@Autowired
	private RideRepository rideRepository;
	
	@GetMapping("/show/{idRide}")
	public Ride find(@PathVariable("idRide") Long rideId) {
		return rideRepository.findOne(rideId);
	}
	
	@GetMapping
	public Iterable<Ride> findAll(){
		return rideRepository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody Ride ride) {
		System.out.println("save | ride " + ride);
		rideRepository.save(ride);
	}
}
