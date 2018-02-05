package fr.blablacar.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import fr.blablacar.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	public List<User> findAllByFirstName(String firstName);
	public User findAllById(long id);
}
