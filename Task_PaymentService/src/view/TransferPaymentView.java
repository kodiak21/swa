package view;

import java.math.BigDecimal;

import model.Account;
import model.PaymentType;

public class TransferPaymentView {

	public void showViewGer(Account sender, Account receiver, BigDecimal amount, PaymentType paymentType) {
		System.out.println("");
		System.out.println(paymentType + " wurde ausgewaehlt!");
		System.out.println(
				amount + " wird ueberwiesen von " + sender.getAccountNumber() + " an " + receiver.getAccountNumber());

	}
	
	public void showViewEng(Account sender, Account receiver, BigDecimal amount, PaymentType paymentType) {
		System.out.println("");
		System.out.println(paymentType + " has been chosen!");
		System.out.println(
				amount + " was transferred from " + sender.getAccountNumber() + " to " + receiver.getAccountNumber());

	}

}
