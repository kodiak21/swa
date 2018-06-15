package de.leuphana.swa.statisticService;

import de.leuphana.swa.bookingService.BookingType;

public interface Visitable {
	public void accept(Visitor visitor, Booking booking, BookingType bookingType, PaymentType paymentType);
	
}
