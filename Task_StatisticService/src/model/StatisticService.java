package model;

import java.math.BigDecimal;
import java.util.List;

public class StatisticService extends Visitor {

	BigDecimal payAmountTotal;
	LanguageType languageType;
	int bookingCount;
	
	public StatisticService() {
		this.bookingCount = 0;
		this.payAmountTotal = new BigDecimal("0");
		this.languageType = null;
	}
	
//	public void getGermanBookingsPaidByPayPal (List<Booking> bookings) {
//		this.languageType = Langu.PAYPAL;
//		for(Booking booking : bookings) {
//			if (booking.paymentType == Langu.PAYPAL && booking instanceof GermanBooking2) {
//				booking.accept(this);
//			}
//		}
//		System.out.println("Es gab " + bookingCount + " Deutsche PayPal-Buchungen im Gesamtwert von " + this.payAmountTotal + this.currency );
//		this.bookingCount = 0;
//		this.payAmountTotal = 0;
//		this.currency ="";
//		this.languageType = null;
//	}
//	public void getGermanBookingsPaidByGoogleWallet (List<Booking> bookings) {
//		this.languageType = Langu.GOOGLEWALLET;
//		for(Booking booking : bookings) {
//			if (booking.paymentType == Langu.GOOGLEWALLET && booking instanceof GermanBooking2) {
//				booking.accept(this);
//			}
//		}
//		System.out.println("Es gab " + bookingCount + " Deutsche GoogleWallet-Buchungen im Gesamtwert von " + this.payAmountTotal + this.currency );
//		this.bookingCount = 0;
//		this.payAmountTotal = 0;
//		this.currency ="";
//		this.languageType = null;
//	}
//	public void getGermanBookingsPaidByMoneyWallet (List<Booking> bookings) {
//		this.languageType = Langu.MONEYWALLET;
//		for(Booking booking : bookings) {
//			if (booking.paymentType == Langu.MONEYWALLET && booking instanceof GermanBooking2) {
//				booking.accept(this);
//			}
//		}
//		System.out.println("Es gab " + bookingCount + " Deutsche MoneyWallet-Buchungen im Gesamtwert von " + this.payAmountTotal + this.currency );
//		this.bookingCount = 0;
//		this.payAmountTotal = 0;
//		this.currency ="";
//		this.languageType = null;
//	}
//	public void getEnglishBookingsPaidByPayPal (List<Booking> bookings) {
//		this.languageType = Langu.PAYPAL;
//		for(Booking booking : bookings) {
//			if (booking.paymentType == Langu.PAYPAL && booking instanceof EnglishBooking2) {
//				booking.accept(this);
//			}
//		}
//		System.out.println("Es gab " + bookingCount + " Englische PayPal-Buchungen im Gesamtwert von " + this.payAmountTotalDollar + this.currency );
//		System.out.println("Das sind " + payAmountTotal + "Euro");
//		this.bookingCount = 0;
//		this.payAmountTotal = 0;
//		this.currency ="";
//		this.languageType = null;
//		this.payAmountTotalDollar = 0;
//	}
//	public void getEnglishBookingsPaidByGoogleWallet (List<Booking> bookings) {
//		this.languageType = Langu.GOOGLEWALLET;
//		for(Booking booking : bookings) {
//			if (booking.paymentType == Langu.GOOGLEWALLET && booking instanceof EnglishBooking2) {
//				booking.accept(this);
//			}
//		}
//		System.out.println("Es gab " + bookingCount + " Englische GoogleWallet-Buchungen im Gesamtwert von " + this.payAmountTotalDollar + this.currency );
//		System.out.println("Das sind " + payAmountTotal + "Euro");
//		this.bookingCount = 0;
//		this.payAmountTotal = 0;
//		this.currency ="";
//		this.languageType = null;
//		this.payAmountTotalDollar = 0;
//	}
	public void getEnglishBookingsPaidByMoneyWallet (List<Payment> payments) {
		this.languageType = LanguageType.ENGLISH;
		for(Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.ENGLISH && payment instanceof MoneyWalletPayment) {
				payment.accept(this);
			}
		}
		System.out.println("Es gab " + bookingCount + " Englische MoneyWallet-Buchungen im Gesamtwert von " + this.payAmountTotal + " Euro");
		System.out.println("Das sind " + payAmountTotal + "Euro");
		this.bookingCount = 0;
		this.payAmountTotal =  new BigDecimal("0");
		this.languageType = null;
	}
	
	@Override
	void visit(PayPalPayment payPalPayment) {
		this.payAmountTotal = payPalPayment.getCurrencyAmount().add(payAmountTotal);
		bookingCount++;
	}

	@Override
	void visit(MoneyWalletPayment moneyWalletPayment) {
		this.payAmountTotal = moneyWalletPayment.getCurrencyAmount().add(payAmountTotal);
		bookingCount++;	
	}

	@Override
	void visit(GoogleWalletPayment googleWalletPayment) {
		this.payAmountTotal = googleWalletPayment.getCurrencyAmount().add(payAmountTotal);
		bookingCount++;
	}

		

}
