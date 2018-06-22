package de.leuphana.swa.statisticService;

public class Booking implements Visitable {

	int payAmount;
	String currency;
	PaymentType paymentType;
	
	
	protected Booking(int payAmount, PaymentType paymentType){
		this.payAmount = payAmount;
		this.paymentType = paymentType;
	}


	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
