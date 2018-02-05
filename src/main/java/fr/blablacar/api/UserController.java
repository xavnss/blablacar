package fr.blablacar.api;

import fr.blablacar.domain.Ride;
import fr.blablacar.domain.User;
import fr.blablacar.dao.UserRepository;
//import fr.blablacar.dao.RideRepository;
import fr.blablacar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService accountService;

    @Autowired
    UserRepository accountRepository;
    
//    @Autowired
//    RideRepository rideRepository;

    @GetMapping("{id}")
    public User find(@PathVariable("id") Long accountId) {
        return accountRepository.findOne(accountId);
    }

    @GetMapping
    public Iterable<User> findAll() {
        return accountRepository.findAll();
    }    
    
    @PostMapping
    public void signup(@RequestBody User account) {
        System.out.println("signup | account: " + account.toString());
        accountService.signup(account);
    }
    
    @PostMapping("{id}/addARide")
    public void addARide(@PathVariable("id") Long accountId, @RequestBody Ride ride){
    	User user = accountRepository.findOne(accountId);
        System.out.println("add a ride | account: " + user.toString() + " |ride: " + ride.toString());
        accountService.addARide(user, ride);
    }
    
//    @PostMapping("{accountId}/{rideId}")
//    public void addRide(@PathVariable("accountId") Long accountId, @PathVariable("rideId") Long rideId) {
//    	accountService.addRide(accountId, rideId);
//    }
}