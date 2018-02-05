package fr.blablacar.domain;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ride {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private Long idOfUserWhoProposed;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfCreating;

	public long getId() {
		return id;
	}

	public long getUserWhoProposed() {
		return idOfUserWhoProposed;
	}

	public void setIdOfUserWhoProposed(long iduserWhoProposed) {
		this.idOfUserWhoProposed = iduserWhoProposed;
	}

	public Date getDateOfCreating() {
		return dateOfCreating;
	}

	public void setDateOfCreating(Date dateOfCreating) {
		this.dateOfCreating = dateOfCreating;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//		
////	@OneToMany
//	private ArrayList<Trajet> partOfRide = new ArrayList<Trajet>();
//
//	
//	
//	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public User getUserWhoProposed() {
//		return userWhoProposed;
//	}
//
//	public void setUserWhoProposed(User userWhoProposed) {
//		this.userWhoProposed = userWhoProposed;
//	}
//
//	public ArrayList<Trajet> getPartOfRide() {
//		return partOfRide;
//	}
//
//	public void setPartOfRide(ArrayList<Trajet> partOfRide) {
//		this.partOfRide = partOfRide;
//	}
//	
//	
//	
//	
//	
//	

}
