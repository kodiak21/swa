package view;

import java.math.BigDecimal;

import model.Account;
import model.PaymentType;

public class TransferPaymentView {

	public void showViewGer(Account sender, Account receiver, BigDecimal amount, PaymentType paymentType) {
		System.out.println("\t**********************************");
		System.out.println("\t"+paymentType + " wurde ausgewaehlt!");
		System.out.println("\t"+
				amount + " wird ueberwiesen von " + sender.getAccountNumber() + " an " + receiver.getAccountNumber());
		System.out.println("\t**********************************");
		System.out.println("");
	}
	
	public void showViewEng(Account sender, Account receiver, BigDecimal amount, PaymentType paymentType) {
		System.out.println("\t**********************************");
		System.out.println("\t"+paymentType + " has been chosen!");
		System.out.println("\t"+
				amount + " was transferred from " + sender.getAccountNumber() + " to " + receiver.getAccountNumber());
		System.out.println("\t**********************************");
		System.out.println("");
	}

}
