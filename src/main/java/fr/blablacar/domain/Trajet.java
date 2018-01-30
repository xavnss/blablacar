package fr.blablacar.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
@Entity
public class Trajet {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@NotBlank
	private String departureCity;
	@NotBlank
	private String arrivalCity;
	
	@Temporal(TemporalType.DATE)
	private Date dateOfDeparture;
	
	@Temporal(TemporalType.DATE)
	private Date dateOfArrival;

	@ManyToOne
	private Ride ride;
	
	private short places;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Date getDateOfArrival() {
		return dateOfArrival;
	}

	public void setDateOfArrival(Date dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}

	public short getPlaces() {
		return places;
	}

	public void setPlaces(short places) {
		this.places = places;
	}
	
	
}
