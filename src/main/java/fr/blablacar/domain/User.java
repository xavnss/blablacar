package fr.blablacar.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@NotBlank
	private String email;	
	@NotBlank
	private String firstName;
	@NotBlank
	private String password;
	
//	private String lastName;
//	
//	@JsonFormat(pattern="yyyy-MM-dd")
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date birthDate;
//	
//	@OneToMany
//	private List<Rate> rating = new ArrayList<Rate>();
//	
//	private boolean confirmed = false;
//	
	@OneToMany
	private List<Ride> rideProposed = new ArrayList<Ride>();

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public Date getBirthDate() {
//		return birthDate;
//	}
//	public void setBirthDate(Date birthDate) {
//		this.birthDate = birthDate;
//	}
//	
//	public float getRating() {
//		if (rating.isEmpty()) return 0;
//		
//		float rate = 0;
//		for (Rate r : rating) {
//			rate += r.getRate();
//		}
//		return rate/rating.size();
//	}
//	
//	public void addRating(Rate rating) {
//		this.rating.add(rating);
//	}
//	
//
//
//	public boolean isConfirmed() {
//		return confirmed;
//	}
//	public void setConfirmed(boolean confirmed) {
//		this.confirmed = confirmed;
//	}
//
//
	public List<Ride> getRideProposed() {
		return rideProposed;
	}


	public void setRideProposed(List<Ride> rideProposed) {
		this.rideProposed = rideProposed;
	}
	
	public void addARide(Ride rideProposed) {
		this.rideProposed.add(rideProposed);
	}
	
	public void deleteARide(Ride ride){
		this.rideProposed.remove(ride);
	}
	
	
	

}
