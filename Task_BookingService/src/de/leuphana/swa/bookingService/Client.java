package de.leuphana.swa.bookingService;

import java.util.ArrayList;
import java.util.List;

import de.leuphana.swa.statisticService.Booking;
import de.leuphana.swa.statisticService.BookingVisitor;
import de.leuphana.swa.statisticService.EnglishBooking;
import de.leuphana.swa.statisticService.GermanBooking;
import de.leuphana.swa.statisticService.PaymentType;

public class Client {

	public static void main(String[] args) {
		
		List<Booking> bookings = new ArrayList<Booking>();
		EnglishBooking eb1 = new EnglishBooking(100, PaymentType.PAYPAL);
		EnglishBooking eb2 = new EnglishBooking(250, PaymentType.GOOGLEWALLET);
		EnglishBooking eb3 = new EnglishBooking(550, PaymentType.PAYPAL);
		GermanBooking gb1 = new GermanBooking(100, PaymentType.PAYPAL);
		GermanBooking gb2 = new GermanBooking(250, PaymentType.GOOGLEWALLET);
		GermanBooking gb3 = new GermanBooking(550, PaymentType.PAYPAL);
		bookings.add(eb1);
		bookings.add(eb2);
		bookings.add(eb3);
		bookings.add(gb1);
		bookings.add(gb2);
		bookings.add(gb3);
		BookingVisitor visitor = new BookingVisitor();
		visitor.getEnglishBookingsPaidByPayPal(bookings);
		visitor.getEnglishBookingsPaidByMoneyWallet(bookings);
		visitor.getEnglishBookingsPaidByGoogleWallet(bookings);
		visitor.getGermanBookingsPaidByPayPal(bookings);
		visitor.getGermanBookingsPaidByMoneyWallet(bookings);
		visitor.getGermanBookingsPaidByGoogleWallet(bookings);
	}

}
