package fr.blablacar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.blablacar.dao.UserRepository;
import fr.blablacar.domain.Ride;
import fr.blablacar.domain.User;

@Service
public class UserService {

	@Autowired
	UserRepository accountRepository;

//	@Autowired
//	RideRepository rideRepository;

	public void signup(User account) {
		accountRepository.save(account);
	}

	public void addARide(User user, Ride ride) {
		user.addARide(ride);
		accountRepository.save(user);
	}
	
	public boolean userExist(User user){
		if(accountRepository.findAllById(user.getId()) != null)
			return true;
		else
			return false;
	}

//	@Transactional
//	public void addRide(Long userId, Long rideId) {
//		User user = accountRepository.findOne(userId);
//		Ride ride = rideRepository.findOne(rideId);
////		user.addRide(ride);
////		ride.setRider(user);
//		accountRepository.save(user);
//	}

}
