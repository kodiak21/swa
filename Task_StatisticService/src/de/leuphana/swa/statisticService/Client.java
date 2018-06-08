package de.leuphana.swa.statisticService;

public class Client {

	public static void createStatistics() {
		
		//StatisticsService nach Visitor Pattern
		
		BookingVisitor visitor = new BookingVisitor();
		PaymentType paymentType = PaymentType.MONEYWALLET;
		
		Booking booking = new Booking();
		
		visitor.visit(booking, paymentType);
		
		int countPayPal = visitor.getCountPayPal();
		int countGoogleWallet = visitor.getCountGoogleWallet();
		int countMoneyWallet = visitor.getCountMoneyWallet();
		
		System.out.println("Payment GermanBooking by PayPal: " + countPayPal );
		System.out.println("Payment GermanBooking by GoogleWallet: " + countGoogleWallet);
		System.out.println("Payment GermanBooking by MoneyWallet: " + countMoneyWallet);
	}
	
	public static void main(String[] args) {
		
		createStatistics();
		
		
		
	}

}
