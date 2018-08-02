package controller;

import java.math.BigDecimal;

import model.Account;
import model.BookingService;
import model.PaymentService;

public class PaymentServiceController {

	PaymentService paymentService = new PaymentService();
	PaymentServiceAction action;
	
	public PaymentService paymentCommand () {
		
		//Hard coded
		BigDecimal currencyAmount = new BigDecimal("500");
		
		Account senderAccount = new Account(2);
		senderAccount.setAmount(0);
				
		action = new CreatePaymentAction(currencyAmount, senderAccount);
		paymentService = action.action(paymentService);
		
		action = new PrintPaymentAction();
		paymentService = action.action(paymentService);
		
		action = new DeletePaymentAction();
		paymentService = action.action(paymentService);

		
		
		return paymentService;
	};
	public PaymentService paymentCommand (BookingService bookingService) {
		
		//Hard coded
		Account senderAccount = new Account(2);
		senderAccount.setAmount(0);
				
		action = new CreatePaymentAction(bookingService, senderAccount);
		paymentService = action.action(paymentService);
		
		action = new PrintPaymentAction();
		paymentService = action.action(paymentService);
		
		action = new DeletePaymentAction();
		paymentService = action.action(paymentService);

		
		
		return paymentService;
	};


	

}
