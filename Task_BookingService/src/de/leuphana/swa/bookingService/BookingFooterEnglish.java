package de.leuphana.swa.bookingService;

public class BookingFooterEnglish extends BookingFooter {
	
	int cost;
	

	public BookingFooterEnglish(int cost) {
		this.cost = cost;
	}
	
	public String printFooter () {
		return "Ihre Bestellungskosten sind " +cost;
	}
}
