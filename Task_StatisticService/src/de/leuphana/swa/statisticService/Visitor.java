package de.leuphana.swa.statisticService;

import de.leuphana.swa.bookingService.BookingType;

public interface Visitor {

	public int visit(Booking booking, BookingType bookingType, PaymentType paymentType);
	
}
