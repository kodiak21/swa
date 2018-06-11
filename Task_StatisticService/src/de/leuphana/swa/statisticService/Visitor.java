package de.leuphana.swa.statisticService;

public interface Visitor {

	public int visit(Booking booking, BookingType bookingType, PaymentType paymentType);
	
}
