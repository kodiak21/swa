package de.leuphana.swa.bookingService;

public class BookingFooterGerman extends BookingFooter {
	
	int cost;
		
	public BookingFooterGerman(int cost) {
		this.cost = cost;
	}
	
	public String printFooter () {
		return "Total costs are: "+cost;
	}
}
