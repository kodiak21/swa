package model;

public class BookingHeaderEnglish extends BookingHeader {
	
	String name;
	
	public BookingHeaderEnglish(String name) {
		this.name = name;
	}
	public String printHeader () {
		return "Dear "+name;
	}
}
