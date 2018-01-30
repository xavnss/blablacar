package fr.blablacar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.blablacar.dao.AccountRepository;
import fr.blablacar.domain.Account;

@Service
public class RideService {

	@Autowired
	AccountRepository accountDao;
	
	public void signup(Account account) {
		 accountDao.save(account);		
	}

}
