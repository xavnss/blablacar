package fr.blablacar.api;

import fr.blablacar.domain.Account;
import fr.blablacar.dao.AccountRepository;
import fr.blablacar.dao.RideRepository;
import fr.blablacar.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    AccountRepository accountRepository;
    
    @Autowired
    RideRepository rideRepository;

    @GetMapping("{id}")
    public Account find(@PathVariable("id") Long accountId) {
        return accountRepository.findOne(accountId);
    }

    @GetMapping
    public Iterable<Account> findAll() {
        return accountRepository.findAll();
    }    
    
    @PostMapping
    public void signup(@RequestBody Account account) {
        System.out.println("signup | account: " + account.toString());
        accountService.signup(account);
    }
    
    @PostMapping("{accountId}/{rideId}")
    public void addRide(@PathVariable("accountId") Long accountId, @PathVariable("rideId") Long rideId) {
    	accountService.addRide(accountId, rideId);
    }
}