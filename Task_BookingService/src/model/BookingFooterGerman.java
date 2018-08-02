package model;

import java.math.BigDecimal;

public class BookingFooterGerman extends BookingFooter {
	
	BigDecimal cost;
		
	public BookingFooterGerman(BigDecimal cost) {
		this.cost = cost;
	}
	
	public String printFooter () {
		return cost+" Euro";
	}
}
