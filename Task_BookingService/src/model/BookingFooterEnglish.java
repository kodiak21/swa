package model;

public class BookingFooterEnglish extends BookingFooter {
	
	float cost;

	public BookingFooterEnglish(float cost) {
		this.cost = cost;
	}
	
	public String printFooter () {
		return cost+" Dollar";
	}
}
