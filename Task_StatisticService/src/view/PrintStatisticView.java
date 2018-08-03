package view;

import java.math.BigDecimal;

import model.LanguageType;
import model.PaymentType;

public class PrintStatisticView {
	public void showViewGer(int bookingCount, BigDecimal payAmountTotal, PaymentType paymentType, LanguageType languageType) {
		if (languageType == LanguageType.ENGLISH) {
			System.out.println("Es gab " + bookingCount + " englische "+paymentType+"-Buchungen im Gesamtwert von " + payAmountTotal + " Euro");
		} else {
			System.out.println("Es gab " + bookingCount + " deutsche "+paymentType+"-Buchungen im Gesamtwert von " + payAmountTotal + " Euro");
		}
	}
	public void showViewEng(int bookingCount, BigDecimal payAmountTotal, PaymentType paymentType, LanguageType languageType) {
		if (languageType == LanguageType.ENGLISH) {
			System.out.println("There have been " + bookingCount + " english "+paymentType+"-bookings with a total of " + payAmountTotal + " Euro");
		} else {
			System.out.println("There have been " + bookingCount + " german "+paymentType+"-bookings with a total of " + payAmountTotal + " Euro");
		}
	}
}
