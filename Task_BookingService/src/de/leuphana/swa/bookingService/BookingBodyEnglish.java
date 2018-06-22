package de.leuphana.swa.bookingService;

public class BookingBodyEnglish extends BookingBody {
	
	String car;
	
	public BookingBodyEnglish (String s) {
		this.car = s;
	}
	
	public String printBody () {
		return "You ordered: " + car;
	}
}
