package de.leuphana.swa.statisticService;

public class EnglishBooking extends Booking {

	double ratio;
	
	public EnglishBooking(int payAmount, PaymentType paymentType){
		super(payAmount, paymentType);
		currency = "Dollar";
		this.ratio = 0.9;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);	
	}
}
