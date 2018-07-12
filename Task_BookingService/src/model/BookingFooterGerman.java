package model;

public class BookingFooterGerman extends BookingFooter {
	
	float cost;
		
	public BookingFooterGerman(float cost) {
		this.cost = cost;
	}
	
	public String printFooter () {
		return cost+" Euro";
	}
}
