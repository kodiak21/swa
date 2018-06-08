package de.leuphana.swa.statisticService;

public interface Visitable {
	public void accept(Visitor visitor, Booking booking, PaymentType paymentType);
	
}
