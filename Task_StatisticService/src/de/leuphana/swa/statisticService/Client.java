package de.leuphana.swa.statisticService;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		Booking b1 = new EnglishBooking(100, PaymentType.PAYPAL);	
		Booking b2 = new EnglishBooking(150, PaymentType.PAYPAL);	
		Booking b3 = new EnglishBooking(200, PaymentType.MONEYWALLET);	
		Booking b4 = new EnglishBooking(250, PaymentType.MONEYWALLET);	
		Booking b5 = new EnglishBooking(100, PaymentType.MONEYWALLET);	
		Booking b6 = new EnglishBooking(100, PaymentType.GOOGLEWALLET);	
		Booking b7 = new EnglishBooking(100, PaymentType.GOOGLEWALLET);
		
		Booking b8 = new GermanBooking(100, PaymentType.PAYPAL);
		Booking b9 = new GermanBooking(100, PaymentType.PAYPAL);
		Booking b10 = new GermanBooking(100, PaymentType.MONEYWALLET);
		Booking b11 = new GermanBooking(100, PaymentType.GOOGLEWALLET);
		Booking b12 = new GermanBooking(100, PaymentType.GOOGLEWALLET);
		
		List<Booking> bookings = new ArrayList<Booking>();
		bookings.add(b1);
		bookings.add(b2);
		bookings.add(b3);
		bookings.add(b4);
		bookings.add(b5);
		bookings.add(b6);
		bookings.add(b7);
		bookings.add(b8);
		bookings.add(b9);
		bookings.add(b10);
		bookings.add(b11);
		bookings.add(b12);
		
		BookingVisitor bv = new BookingVisitor();
		bv.getEnglishBookingsPaidByGoogleWallet(bookings);
		bv.getEnglishBookingsPaidByMoneyWallet(bookings);
		bv.getEnglishBookingsPaidByPayPal(bookings);
		bv.getGermanBookingsPaidByGoogleWallet(bookings);
		bv.getGermanBookingsPaidByMoneyWallet(bookings);
		bv.getGermanBookingsPaidByPayPal(bookings);
		
	}

}
