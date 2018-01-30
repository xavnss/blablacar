package fr.blablacar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.blablacar.domain.Ride;
@Repository
public interface RideRepository extends CrudRepository<Ride, Long> {
}
