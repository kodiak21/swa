package controller;

import java.math.BigDecimal;

import model.Account;
import model.BookingService;
import model.PaymentService;

public class PaymentServiceController {

	PaymentService paymentService = new PaymentService();
	PaymentServiceAction action;
	
	public PaymentService paymentCommand (BigDecimal currencyAmount, Account senderAccount) {
				
		action = new CreatePaymentAction(currencyAmount, senderAccount);
		paymentService = action.action(paymentService);
		
		action = new PrintPaymentAction();
		paymentService = action.action(paymentService);
		
		action = new DeletePaymentAction();
		paymentService = action.action(paymentService);

		
		
		return paymentService;
	};	

}
