package view;

import model.Payment;
import model.PaymentService;

public class PrintPaymentView {
	public void showViewGer(PaymentService paymentService) {
		
		Payment payment = paymentService.getPayment();
		
		System.out.println("");
		System.out.println("Deine Zahlungsangaben:");
		System.out.println("Account ID: "+payment.getSenderAccount().getAccountNumber());
		System.out.println("Empfaengerkonto: "+payment.getReceiverAccount().getAccountNumber());
		System.out.println("Summe: "+payment.getCurrencyAmount());
		System.out.println("Zahlungsart: "+payment.getPaymentType());
		System.out.println("");
	}
	
	public void showViewEng(PaymentService paymentService) {
		
		Payment payment = paymentService.getPayment();
		
		System.out.println("");
		System.out.println("Your payment details: ");
		System.out.println("Account ID: "+payment.getSenderAccount().getAccountNumber());
		System.out.println("Receiver Account: "+payment.getReceiverAccount().getAccountNumber());
		System.out.println("Total sum: "+payment.getCurrencyAmount());
		System.out.println("Choice of payment: "+payment.getPaymentType());
		System.out.println("");
	}
}
