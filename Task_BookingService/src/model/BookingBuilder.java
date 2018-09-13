package model;

import java.math.BigDecimal;

public interface BookingBuilder {
		
	Booking build();
	
	BookingBuilder setHeader(String name);
	BookingBuilder setBody(CarBrandType carBrandType);
	BookingBuilder setFooter(BigDecimal cost);
	
}
