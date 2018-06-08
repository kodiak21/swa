package de.leuphana.swa.statisticService;

public class BookingVisitor implements Visitor {

	private int countPayPal;
	private int countGoogleWallet;
	private int countMoneyWallet;

	public int visit(Booking booking, PaymentType paymentType) {
		
		switch(paymentType) {
		case PAYPAL:
			countPayPal += 1;
			return getCountPayPal();
		case GOOGLEWALLET:
			countGoogleWallet +=1;
			return getCountGoogleWallet();
		case MONEYWALLET:
			countMoneyWallet +=1;
			return getCountMoneyWallet();
		default:
			break;
		}
		
		int total = countPayPal + countGoogleWallet + countMoneyWallet;
		
		return total;
		
	}
	
	public int getCountPayPal() {
		return countPayPal;
	}

	public int getCountGoogleWallet() {
		return countGoogleWallet;
	}

	public int getCountMoneyWallet() {
		return countMoneyWallet;
	}


}
