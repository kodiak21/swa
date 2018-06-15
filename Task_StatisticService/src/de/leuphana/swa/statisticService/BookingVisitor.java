package de.leuphana.swa.statisticService;

import java.util.List;

public class BookingVisitor extends Visitor {

	int payAmountTotal;
	String currency;
	PaymentType paymentType;
	int bookingCount;
	int payAmountTotalDollar;
	
	public BookingVisitor() {
		this.bookingCount = 0;
		this.payAmountTotal = 0;
		this.currency ="";
		this.paymentType = null;
		this.payAmountTotalDollar = 0;
	}
	
	public void getGermanBookingsPaidByPayPal (List<Booking> bookings) {
		this.paymentType = PaymentType.PAYPAL;
		for(Booking booking : bookings) {
			if (booking.paymentType == PaymentType.PAYPAL && booking instanceof GermanBooking) {
				booking.accept(this);
			}
		}
		System.out.println("Es gab " + bookingCount + " Deutsche PayPal-Buchungen im Gesamtwert von " + this.payAmountTotal + this.currency );
		this.bookingCount = 0;
		this.payAmountTotal = 0;
		this.currency ="";
		this.paymentType = null;
	}
	public void getGermanBookingsPaidByGoogleWallet (List<Booking> bookings) {
		this.paymentType = PaymentType.GOOGLEWALLET;
		for(Booking booking : bookings) {
			if (booking.paymentType == PaymentType.GOOGLEWALLET && booking instanceof GermanBooking) {
				booking.accept(this);
			}
		}
		System.out.println("Es gab " + bookingCount + " Deutsche GoogleWallet-Buchungen im Gesamtwert von " + this.payAmountTotal + this.currency );
		this.bookingCount = 0;
		this.payAmountTotal = 0;
		this.currency ="";
		this.paymentType = null;
	}
	public void getGermanBookingsPaidByMoneyWallet (List<Booking> bookings) {
		this.paymentType = PaymentType.MONEYWALLET;
		for(Booking booking : bookings) {
			if (booking.paymentType == PaymentType.MONEYWALLET && booking instanceof GermanBooking) {
				booking.accept(this);
			}
		}
		System.out.println("Es gab " + bookingCount + " Deutsche MoneyWallet-Buchungen im Gesamtwert von " + this.payAmountTotal + this.currency );
		this.bookingCount = 0;
		this.payAmountTotal = 0;
		this.currency ="";
		this.paymentType = null;
	}
	public void getEnglishBookingsPaidByPayPal (List<Booking> bookings) {
		this.paymentType = PaymentType.PAYPAL;
		for(Booking booking : bookings) {
			if (booking.paymentType == PaymentType.PAYPAL && booking instanceof GermanBooking) {
				booking.accept(this);
			}
		}
		System.out.println("Es gab " + bookingCount + " Englische PayPal-Buchungen im Gesamtwert von " + this.payAmountTotal + this.currency );
		System.out.println("Das sind " + payAmountTotal + "Euro");
		this.bookingCount = 0;
		this.payAmountTotal = 0;
		this.currency ="";
		this.paymentType = null;
		this.payAmountTotalDollar = 0;
	}
	public void getEnglishBookingsPaidByGoogleWallet (List<Booking> bookings) {
		this.paymentType = PaymentType.GOOGLEWALLET;
		for(Booking booking : bookings) {
			if (booking.paymentType == PaymentType.GOOGLEWALLET && booking instanceof GermanBooking) {
				booking.accept(this);
			}
		}
		System.out.println("Es gab " + bookingCount + " Englische GoogleWallet-Buchungen im Gesamtwert von " + this.payAmountTotal + this.currency );
		System.out.println("Das sind " + payAmountTotal + "Euro");
		this.bookingCount = 0;
		this.payAmountTotal = 0;
		this.currency ="";
		this.paymentType = null;
		this.payAmountTotalDollar = 0;
	}
	public void getEnglishBookingsPaidByMoneyWallet (List<Booking> bookings) {
		this.paymentType = PaymentType.MONEYWALLET;
		for(Booking booking : bookings) {
			if (booking.paymentType == PaymentType.MONEYWALLET && booking instanceof GermanBooking) {
				booking.accept(this);
			}
		}
		System.out.println("Es gab " + bookingCount + " Englische MoneyWallet-Buchungen im Gesamtwert von " + this.payAmountTotal + this.currency );
		System.out.println("Das sind " + payAmountTotal + "Euro");
		this.bookingCount = 0;
		this.payAmountTotal = 0;
		this.currency ="";
		this.paymentType = null;
		this.payAmountTotalDollar = 0;
	}
	
	
	public void visit(EnglishBooking eb) {
		this.currency = eb.currency;
		this.payAmountTotalDollar += eb.payAmount;
		bookingCount++;
		this.payAmountTotal += eb.payAmount*eb.ratio;
	}
	
	public void visit(GermanBooking gb) {
		this.currency = gb.currency;
		this.payAmountTotal += gb.payAmount;

		bookingCount++;
	}

		

}
