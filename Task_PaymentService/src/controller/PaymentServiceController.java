package controller;

import model.Account;
import model.Payment;
import model.PaymentService;

public class PaymentServiceController {

	PaymentService paymentService = new PaymentService();
	PaymentServiceAction action;
	
	public Payment paymentCommand () {
		
		//Hard coded
		float currencyAmount = 500;
		
		Account senderAccount = new Account(2);
		senderAccount.setAmount(0);
				
		action = new CreatePaymentAction(currencyAmount, senderAccount);
		paymentService = action.action(paymentService);
		
		action = new PrintPaymentAction();
		paymentService = action.action(paymentService);
		
		action = new DeletePaymentAction();
		paymentService = action.action(paymentService);

		
		
		return paymentService.getPayment();
	};


	

}
