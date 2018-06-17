package de.leuphana.swa.bookingService;

public class BookingBodyGerman extends BookingBody {
	
	String car;
	
	public BookingBodyGerman (String s) {
		this.car = s;
	}
	public String printBody () {
		return "Sie haben folgendes bestellt: "+car;
	}
}
