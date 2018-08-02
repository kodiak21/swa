package model;

import java.math.BigDecimal;

public class BookingFooterEnglish extends BookingFooter {
	
	BigDecimal cost;

	public BookingFooterEnglish(BigDecimal cost) {
		this.cost = cost;
	}
	
	public String printFooter () {
		return cost+" Dollar";
	}
}
