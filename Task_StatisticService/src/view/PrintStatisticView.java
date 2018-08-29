package view;

import java.math.BigDecimal;

import model.LanguageType;
import model.PaymentType;

public class PrintStatisticView {
	public void showViewGer(int bookingCount, BigDecimal payAmountTotal, PaymentType paymentType, LanguageType languageType) {
		System.out.println("\t**********************************");
		if (languageType == LanguageType.ENGLISH) {
			System.out.println("\tEs gab");
			System.out.println("\t"+bookingCount + " englische "+paymentType+"-Buchungen");
			System.out.println("\tim Gesamtwert von");
			System.out.println("\t"+payAmountTotal + " Euro");
		} else {
			System.out.println("\tEs gab");
			System.out.println("\t"+bookingCount + " deutsche "+paymentType+"-Buchungen");
			System.out.println("\tim Gesamtwert von");
			System.out.println("\t"+payAmountTotal + " Euro");
		}
		System.out.println("\t**********************************");
		System.out.println("");
	}
	public void showViewEng(int bookingCount, BigDecimal payAmountTotal, PaymentType paymentType, LanguageType languageType) {
		System.out.println("\t**********************************");
		if (languageType == LanguageType.ENGLISH) {
			System.out.println("\tThere have been");
			System.out.println("\t"+bookingCount + " english "+paymentType+"-bookings");
			System.out.println("\twith a total of");
			System.out.println("\t"+payAmountTotal + " Euro");
		} else {
			System.out.println("\tThere have been");
			System.out.println("\t"+bookingCount + " german "+paymentType+"-bookings");
			System.out.println("\twith a total of");
			System.out.println("\t"+payAmountTotal + " Euro");
		}
		System.out.println("\t**********************************");
		System.out.println("");
	}
}
