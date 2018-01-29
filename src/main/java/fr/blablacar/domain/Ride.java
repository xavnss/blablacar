package fr.blablacar.domain;

import java.util.GregorianCalendar;
import java.util.List;

public class Ride {
	
	private long id;
	private GregorianCalendar startDate;
	private List<Location> locations;
	private List<GregorianCalendar> arrivalDates;
	private short totalPlaces;
	private short leftPlaces;
	private List<String> caracteristics;
	
	
	Ride(GregorianCalendar startDate, List<Location> locations,
			List<GregorianCalendar> arrivalDates, short totalPlaces, short leftPlaces, List<String> caracteristics){
		this.startDate = startDate;
		this.locations = locations;
		this.arrivalDates = arrivalDates;
		this.totalPlaces = totalPlaces;
		this.leftPlaces = leftPlaces;
		this.caracteristics = caracteristics;
	}
	
	
	public GregorianCalendar getStartDate() {
		return startDate;
	}
	public void setStartDate(GregorianCalendar startDate) {
		this.startDate = startDate;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	public List<GregorianCalendar> getArrivalDates() {
		return arrivalDates;
	}
	public void setArrivalDates(List<GregorianCalendar> arrivalDates) {
		this.arrivalDates = arrivalDates;
	}
	public short getTotalPlaces() {
		return totalPlaces;
	}
	public void setTotalPlaces(short totalPlaces) {
		this.totalPlaces = totalPlaces;
	}
	public short getLeftPlaces() {
		return leftPlaces;
	}
	public void setLeftPlaces(short leftPlaces) {
		this.leftPlaces = leftPlaces;
	}
	public List<String> getCaracteristics() {
		return caracteristics;
	}
	public void setCaracteristics(List<String> caracteristics) {
		this.caracteristics = caracteristics;
	}
	public long getId() {
		return id;
	}
	
	
	
	
	
	

}
