package model;

import java.math.BigDecimal;

import model.resource.Resource;

public interface BookingBuilder {
		
	Booking build();
	
	BookingBuilder setHeader(String name);
	BookingBuilder setBody();
	BookingBuilder setFooter(BigDecimal cost);
	
}
