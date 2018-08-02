package controller;

import java.math.BigDecimal;

import model.Account;
import model.BookingService;
import model.PaymentService;

public class CreatePaymentAction implements PaymentServiceAction {

	Account senderAccount;
	BigDecimal currencyAmount;
	PaymentServiceAction action;
	
	public CreatePaymentAction(BigDecimal currencyAmount, Account senderAccount) {
		this.currencyAmount = currencyAmount;
		this.senderAccount = senderAccount;
	}
	public CreatePaymentAction(BookingService bookingService, Account senderAccount) {
		this.currencyAmount = bookingService.getCost();
		this.senderAccount = senderAccount;
	}
	
	@Override
	public PaymentService action(PaymentService paymentService) {
		
		action = new QuestionPaymentAction();
		paymentService = action.action(paymentService);
		
		paymentService.setCurrencyAmount(currencyAmount);
		paymentService.setSenderAccount(senderAccount);
		paymentService.createPayment();
		
		return paymentService;
	}

}
