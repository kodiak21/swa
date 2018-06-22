package de.leuphana.swa.statisticService;

public class GermanBooking extends Booking {
	
	public GermanBooking(int payAmount, PaymentType paymentType){
		super(payAmount, paymentType);
		currency = "Euro";
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);	
	}
}
