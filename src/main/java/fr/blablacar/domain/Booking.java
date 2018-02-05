//package fr.blablacar.domain;
//
//import java.util.GregorianCalendar;
//
//public class Booking {
//	private static long currentRideId = 0;
//	private User login;
//	private long rideId;
//	private short seatCount;
//	private GregorianCalendar dateCreation;
//	
//	Booking(User user, short seat){
//		this.rideId = currentRideId++;
//		this.login = user;
//		this.seatCount = seat;
//		dateCreation = (GregorianCalendar) GregorianCalendar.getInstance();
//	}
//
//	public User getLogin() {
//		return login;
//	}
//
//	public void setLogin(User login) {
//		this.login = login;
//	}
//
//	public short getSeatCount() {
//		return seatCount;
//	}
//
//	public void setSeatCount(short seatCount) {
//		this.seatCount = seatCount;
//	}
//
//	public GregorianCalendar getDateCreation() {
//		return dateCreation;
//	}
//
//	public void setDateCreation(GregorianCalendar dateCreation) {
//		this.dateCreation = dateCreation;
//	}
//
//	public long getRideId() {
//		return rideId;
//	}
//	
//	
//}
