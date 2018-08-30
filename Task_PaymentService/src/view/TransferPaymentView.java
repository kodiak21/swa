package view;

import java.math.BigDecimal;

import model.Account;
import model.PaymentType;

public class TransferPaymentView {

	public void showViewGer(Account sender, Account receiver, BigDecimal amount, PaymentType paymentType) {
		System.out.println("\t**********************************");
		System.out.println("\t"+paymentType + " wurde ausgewaehlt!");
		System.out.println("\tDer Betrag "+
				amount + " wird ueberwiesen von Ihrem Konto " + sender.getAccountNumber() + " an unser Konto " + receiver.getAccountNumber());
		System.out.println("\t**********************************");
		System.out.println("");
	}
	
	public void showViewEng(Account sender, Account receiver, BigDecimal amount, PaymentType paymentType) {
		System.out.println("\t**********************************");
		System.out.println("\t"+paymentType + " has been chosen!");
		System.out.println("\tThe amount of "+
				amount + " was transferred from your account " + sender.getAccountNumber() + " to our account " + receiver.getAccountNumber());
		System.out.println("\t**********************************");
		System.out.println("");
	}

}
