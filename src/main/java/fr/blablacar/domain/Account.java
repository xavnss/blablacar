package fr.blablacar.domain;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Account {
	private static long currentID = 0;
	private long id;
	private String password;
	private String firstName;
	private String lastName;
	private GregorianCalendar birthDate;
	private String email;
	private List<Integer> rating;
	private boolean confirmed;
	
	Account(String pwd, String firstN, String lastN, GregorianCalendar birth, String mail){
		this.password = pwd;
		this.firstName = firstN;
		this.lastName = lastN;
		this.birthDate = birth;
		this.email = mail;
		
		id = currentID++;
		rating = new ArrayList<Integer>();
		confirmed = false;
	}

	
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public GregorianCalendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(GregorianCalendar birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getRating() {
		if (rating.isEmpty()) return 0;
		
		float rate = 0;
		for (Integer i : rating) {
			rate += i;
		}
		return rate/rating.size();
	}
	
	public void addRating(Integer rating) {
		this.rating.add(rating);
	}
	public long getId() {
		return id;
	}


	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	
	
	

}
