package actions;

import java.math.BigDecimal;

import model.Account;
import model.LanguageType;
import model.PaymentService;

/**<b> Übergeordneter Service</b>: PaymentService<br>
 * 
 * <br>
 * <b>CreatePaymentAction:</b> Ein Paymentobjekt wird erzeugt
 * 
 * @param languageType - Sprachauswahl
 * @param senderAccount - Kundenkonto
 * @param currencyAmount - zu bezahlender Betrag
 * 
 *
 */


public class CreatePaymentAction implements PaymentServiceAction {

	Account senderAccount;
	BigDecimal currencyAmount;
	PaymentServiceAction action;
	LanguageType languageType;
	
	public CreatePaymentAction(BigDecimal currencyAmount, Account senderAccount, LanguageType languageType) {
		this.currencyAmount = currencyAmount;
		this.senderAccount = senderAccount;
		this.languageType = languageType;
	}
	
	@Override
	public PaymentService action(PaymentService paymentService) {
		
		action = new QuestionPaymentAction();
		paymentService = action.action(paymentService);
		
		paymentService.setCurrencyAmount(currencyAmount);
		paymentService.setSenderAccount(senderAccount);
		paymentService.setLanguageType(languageType);
		paymentService.createPayment();
		
		return paymentService;
	}

}
