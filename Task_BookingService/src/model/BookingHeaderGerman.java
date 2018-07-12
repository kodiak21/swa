package model;

public class BookingHeaderGerman extends BookingHeader {
	
	String name;
	
	public BookingHeaderGerman(String name) {
		this.name = name;
	}
	public String printHeader () {
		return "Hallo "+name;
	}
}
