package view;

import model.Payment;
import model.PaymentService;

public class PrintPaymentView {
	public void showViewGer(PaymentService paymentService) {
		
		Payment payment = paymentService.getPayment();
		
		System.out.println("\t**********************************");
		System.out.println("\tDeine Zahlungsangaben:");
		System.out.println("\tAccount ID: "+payment.getSenderAccount().getAccountNumber());
		System.out.println("\tEmpfaengerkonto: "+payment.getReceiverAccount().getAccountNumber());
		System.out.println("\tSumme: "+payment.getCurrencyAmount());
		System.out.println("\tZahlungsart: "+payment.getPaymentType());
		System.out.println("\t**********************************");
		System.out.println("");
	}
	
	public void showViewEng(PaymentService paymentService) {
		
		Payment payment = paymentService.getPayment();
		
		System.out.println("\t**********************************");
		System.out.println("\tYour payment details: ");
		System.out.println("\tAccount ID: "+payment.getSenderAccount().getAccountNumber());
		System.out.println("\tReceiver Account: "+payment.getReceiverAccount().getAccountNumber());
		System.out.println("\tTotal sum: "+payment.getCurrencyAmount());
		System.out.println("\tChoice of payment: "+payment.getPaymentType());
		System.out.println("\t**********************************");
		System.out.println("");
	}
}
