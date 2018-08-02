package controller;

import java.math.BigDecimal;

import model.Account;
import model.PaymentService;
import view.QuestionDeletePaymentView;

public class DeletePaymentAction implements PaymentServiceAction {

	@Override
	public PaymentService action(PaymentService paymentService) {
		
		int answer=0;
		
		QuestionDeletePaymentView view = new QuestionDeletePaymentView();
		answer = view.showView();
		
		switch (answer) {
		case 1:	
			break;
		case 2:	
			paymentService.deletePayment(); 
			break;
		case 3:
			BigDecimal currencyAmount = paymentService.getCurrencyAmount();
			Account senderAccount = paymentService.getSenderAccount();
			PaymentServiceController paymentServiceController = new PaymentServiceController();
			paymentService.setPayment(paymentServiceController.paymentCommand(currencyAmount, senderAccount).getPayment());
			break;
		default: break;
		}
		
		return paymentService;
	}

}
