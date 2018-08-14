package controller;

import java.math.BigDecimal;

import model.Account;
import model.LanguageType;
import model.PaymentService;

public class PaymentServiceController {

	public PaymentService paymentCommand(BigDecimal currencyAmount, Account senderAccount, LanguageType languageType) {
		PaymentServiceAction action;
		PaymentService paymentService = new PaymentService(languageType);

		action = new CreatePaymentAction(currencyAmount, senderAccount, languageType);
		paymentService = action.action(paymentService);

		action = new PrintPaymentAction();
		paymentService = action.action(paymentService);

		action = new DeletePaymentAction();
		paymentService = action.action(paymentService);
		
		if(paymentService.getDeleteAnswer()==2) {
			action = new FareWellPaymentAction();
			paymentService = action.action(paymentService);
		}
		
		action = new TransferPaymentAction();
		paymentService = action.action(paymentService);

		return paymentService;
	};

}
