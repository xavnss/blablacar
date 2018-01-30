package fr.blablacar.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import fr.blablacar.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{
	public List<Account> findAllByFirstName(String firstName);
}
