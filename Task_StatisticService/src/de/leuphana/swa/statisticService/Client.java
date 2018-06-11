package de.leuphana.swa.statisticService;

public class Client {

	public static void createStatistics() {
		
		//StatisticsService nach Visitor Pattern
		
		BookingVisitor visitor = new BookingVisitor();
		
		PaymentType paymentType = PaymentType.PAYPAL;
		BookingType bookingType = BookingType.GERMAN;
		
		Booking booking = new Booking();
		
		int total = visitor.visit(booking, bookingType, paymentType);
		
		if(bookingType == BookingType.GERMAN) {
			int countPayPalGerman = visitor.getCountPayPalGerman();
			int countGoogleWalletGerman = visitor.getCountGoogleWalletGerman();
			int countMoneyWalletGerman = visitor.getCountMoneyWalletGerman();
			
			System.out.println("Bezahlung GermanBooking mit PayPal: " + countPayPalGerman );
			System.out.println("Bezahlung GermanBooking mit GoogleWallet: " + countGoogleWalletGerman);
			System.out.println("Bezahlung GermanBooking mit MoneyWallet: " + countMoneyWalletGerman);
			
			System.out.println("Gesamtzahl Buchungen: " + total);
			
		}else if(bookingType == BookingType.ENGLISH){
			
			int countPayPalEnglish = visitor.getCountPayPalEnglish();
			int countGoogleWalletEnglish = visitor.getCountGoogleWalletEnglish();
			int countMoneyWalletEnglish = visitor.getCountMoneyWalletEnglish();
			
			System.out.println("Payment EnglishBooking by PayPal: " + countPayPalEnglish );
			System.out.println("Payment EnglishBooking by GoogleWallet: " + countGoogleWalletEnglish);
			System.out.println("Payment EnglishBooking by MoneyWallet: " + countMoneyWalletEnglish);
			
			System.out.println("Total Bookings: " + total);
		}
		
	}
	
	public static void main(String[] args) {
		
		createStatistics();
		
		
		
	}

}
