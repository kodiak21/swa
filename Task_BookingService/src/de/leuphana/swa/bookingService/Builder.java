package de.leuphana.swa.bookingService;

public interface Builder {
		
	Booking build();
	
	Builder setHeader(BookingType bookingType);
	Builder setBody(BookingType bookingType);
	Builder setFooter(BookingType bookingType);
	
}
