package view;

import model.Payment;
import model.PaymentService;

public class PrintPaymentView {
	public void showView(PaymentService paymentService) {
		
		Payment payment = paymentService.getPayment();
		
		System.out.println("");
		System.out.println("Deine Zahlungsangaben:");
		System.out.println("Account ID: "+payment.getSenderAccount().getAccountNumber());
		System.out.println("Empfaengerkonto: "+payment.getReceiverAccount().getAccountNumber());
		System.out.println("Summe: "+payment.getCurrencyAmount());
		System.out.println("Zahlungsart: "+payment.getPaymentType());
		System.out.println("Authentifizierungsart: "+payment.getCredentialType());
		System.out.println("");
	}
}
