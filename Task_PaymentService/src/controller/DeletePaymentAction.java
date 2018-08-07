package controller;

import java.math.BigDecimal;

import model.Account;
import model.LanguageType;
import model.PaymentService;
import view.QuestionDeletePaymentView;

public class DeletePaymentAction implements PaymentServiceAction {

	@Override
	public PaymentService action(PaymentService paymentService) {
		
		int answer=0;
		
		QuestionDeletePaymentView questionDeletePaymentView = new QuestionDeletePaymentView();
		if(paymentService.getLanguageType()==LanguageType.GERMAN) {
			answer = questionDeletePaymentView.showViewGer();
		}else if(paymentService.getLanguageType()==LanguageType.ENGLISH) {
			answer = questionDeletePaymentView.showViewEng();
		}
		
		switch (answer) {
		case 1:	
			break;
		case 2:	
			paymentService.deletePayment(); 
			break;
		case 3:
			BigDecimal currencyAmount = paymentService.getCurrencyAmount();
			Account senderAccount = paymentService.getSenderAccount();
			LanguageType languageType = paymentService.getLanguageType();
			PaymentServiceController paymentServiceController = new PaymentServiceController();
			paymentService.setPayment(paymentServiceController.paymentCommand(currencyAmount, senderAccount, languageType).getPayment());
			break;
		default: break;
		}
		
		return paymentService;
	}

}
