package de.leuphana.swa.statisticService;

public class Booking implements Visitable {

	@Override
	public void accept(Visitor visitor, Booking booking, PaymentType paymentType) {
		visitor.visit(booking, paymentType);
	}

}
