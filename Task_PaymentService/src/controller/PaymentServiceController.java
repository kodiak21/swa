package controller;

import java.math.BigDecimal;

import actions.CreatePaymentAction;
import actions.DeletePaymentAction;
import actions.FareWellPaymentAction;
import actions.PaymentServiceAction;
import actions.PrintPaymentAction;
import model.Account;
import model.LanguageType;
import model.PaymentService;

/**<b> Übergeordneter Service</b>: PaymentService<br>
 * 
 * <br><b>AuthentificationServiceController:</b> Controller, der alle PaymentService bezogenen Aktionen verwaltet<br> 
 * 
 * <br><b>verwaltete Aktionen:</b> Funktionen werden in den einzelnen Klassen erläutert<br>
 *
 * <br> - CreatePaymentAction
 * <br> - PrintPaymentAction
 * <br> - DeletePaymentAction
 * <br> - FareWellPaymentAction
 * 
 *
 */

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

		return paymentService;
	};

}
