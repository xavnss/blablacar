package fr.blablacar.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.blablacar.domain.Ride;
//import fr.blablacar.domain.Trajet;
@Repository
public interface RideRepository extends CrudRepository<Ride, Long> {
	public List<Ride> findAll/*ByTrajet*/(/*Trajet trajetVoulu*/);
}
