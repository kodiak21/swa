package de.leuphana.swa.bookingService;

public interface BookingBuilder {
		
	Booking build();
	
	BookingBuilder setHeader();
	BookingBuilder setBody(String car);
	BookingBuilder setFooter(int cost);
	
}
