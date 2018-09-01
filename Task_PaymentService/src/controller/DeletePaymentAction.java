package controller;

import java.math.BigDecimal;

import model.Account;
import model.LanguageType;
import model.PaymentService;
import view.QuestionDeletePaymentView;

/**<b> Übergeordneter Service</b>: PaymentService<br>
 * 
 * <br>
 * <b>DeletePaymentAction:</b> Ein Paymentobjekt wird nach Anfrage gelöscht
 * 
 * @param answer - Kundenauswahl
 * 
 * 
 *
 */

public class DeletePaymentAction implements PaymentServiceAction {

	@Override
	public PaymentService action(PaymentService paymentService) {
		
		int answer=0;
		
		QuestionDeletePaymentView questionDeletePaymentView = new QuestionDeletePaymentView();
		if(paymentService.getLanguageType()==LanguageType.GERMAN) {
			paymentService.setDeleteAnswer(questionDeletePaymentView.showViewGer());
		}else if(paymentService.getLanguageType()==LanguageType.ENGLISH) {
			paymentService.setDeleteAnswer(questionDeletePaymentView.showViewEng());
		}
		
		answer = paymentService.getDeleteAnswer();
		
		switch (answer) {
		case 1:	
			PaymentServiceAction action;
			action = new TransferPaymentAction();
			paymentService = action.action(paymentService);
			break;
		case 2:	
			paymentService.deletePayment(); 
			break;
		case 3:
			BigDecimal currencyAmount = paymentService.getCurrencyAmount();
			Account senderAccount = paymentService.getSenderAccount();
			LanguageType languageType = paymentService.getLanguageType();
			PaymentServiceController paymentServiceController = new PaymentServiceController();
			paymentService.deletePayment();
			
			paymentService = paymentServiceController.paymentCommand(currencyAmount, senderAccount, languageType);
			break;
		default: break;
		}
		
		return paymentService;
	}

}
