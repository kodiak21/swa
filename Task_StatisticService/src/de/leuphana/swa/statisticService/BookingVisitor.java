package de.leuphana.swa.statisticService;

public class BookingVisitor implements Visitor {

	private int countPayPalGerman;
	private int countGoogleWalletGerman;
	private int countMoneyWalletGerman;
	
	private int countPayPalEnglish;
	private int countGoogleWalletEnglish;
	private int countMoneyWalletEnglish;

	public int visit(Booking booking, BookingType bookingType, PaymentType paymentType) {

		if (bookingType == BookingType.GERMAN) {
			switch (paymentType) {
			case PAYPAL:
				countPayPalGerman += 1;
				return getCountPayPalGerman();
			case GOOGLEWALLET:
				countGoogleWalletGerman += 1;
				return getCountGoogleWalletGerman();
			case MONEYWALLET:
				countMoneyWalletGerman += 1;
				return getCountMoneyWalletGerman();
			default:
				break;
			}
		}else if(bookingType == BookingType.ENGLISH) {
			switch (paymentType) {
			case PAYPAL:
				countPayPalEnglish += 1;
				return getCountPayPalEnglish();
			case GOOGLEWALLET:
				countGoogleWalletEnglish += 1;
				return getCountGoogleWalletEnglish();
			case MONEYWALLET:
				countMoneyWalletEnglish += 1;
				return getCountMoneyWalletEnglish();
			default:
				break;
			}
		}
		
		int total = countPayPalGerman + countGoogleWalletGerman 
				+ countMoneyWalletGerman + countPayPalEnglish + countGoogleWalletEnglish 
				+ countMoneyWalletEnglish;

		return total;

	}

	public int getCountPayPalGerman() {
		return countPayPalGerman;
	}

	public int getCountGoogleWalletGerman() {
		return countGoogleWalletGerman;
	}

	public int getCountMoneyWalletGerman() {
		return countMoneyWalletGerman;
	}
	
	public int getCountPayPalEnglish() {
		return countPayPalEnglish;
	}

	public int getCountGoogleWalletEnglish() {
		return countGoogleWalletEnglish;
	}

	public int getCountMoneyWalletEnglish() {
		return countMoneyWalletEnglish;
	}

}
