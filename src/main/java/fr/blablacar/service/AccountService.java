package fr.blablacar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.blablacar.dao.AccountRepository;
import fr.blablacar.dao.RideRepository;
import fr.blablacar.domain.Account;
import fr.blablacar.domain.Ride;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	RideRepository rideRepository;

	public void signup(Account account) {
		accountRepository.save(account);
	}

	@Transactional
	public void addRide(Long userId, Long rideId) {
		Account user = accountRepository.findOne(userId);
		Ride ride = rideRepository.findOne(rideId);
		user.addRide(ride);
		ride.setRider(user);
		accountRepository.save(user);
	}

}
