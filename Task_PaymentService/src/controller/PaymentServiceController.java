package controller;

import java.math.BigDecimal;

import model.Account;
import model.LanguageType;
import model.PaymentService;

public class PaymentServiceController {

	PaymentService paymentService = new PaymentService();
	PaymentServiceAction action;
	
	public PaymentService paymentCommand (BigDecimal currencyAmount, Account senderAccount, LanguageType languageType) {
				
		action = new CreatePaymentAction(currencyAmount, senderAccount, languageType);
		paymentService = action.action(paymentService);
		
		action = new PrintPaymentAction();
		paymentService = action.action(paymentService);
		
		action = new DeletePaymentAction();
		paymentService = action.action(paymentService);

		
		
		return paymentService;
	};	

}
