package controller;

import model.PaymentService;
import model.PaymentType;
import view.QuestionPaymentView;

public class QuestionPaymentAction implements PaymentServiceAction{
	public PaymentService action(PaymentService paymentService) {
		
		int answer=0;		
		QuestionPaymentView view = new QuestionPaymentView();
		
		PaymentType paymentType = null;
		answer = view.showView();

		switch (answer) {
		case 1:	paymentType = PaymentType.PAYPAL; break;
		case 2:	paymentType = PaymentType.GOOGLEWALLET; break;
		case 3:	paymentType = PaymentType.MONEYWALLET; break;
		default: action(paymentService);
		}
		paymentService.setPaymentType(paymentType);
		return paymentService;

	}
}
