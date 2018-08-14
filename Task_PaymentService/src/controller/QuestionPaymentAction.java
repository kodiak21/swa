package controller;

import model.LanguageType;
import model.PaymentService;
import model.PaymentType;
import view.QuestionPaymentView;

public class QuestionPaymentAction implements PaymentServiceAction {
	public PaymentService action(PaymentService paymentService) {

		QuestionPaymentView questionPaymentView = new QuestionPaymentView();

		int answer = 0;

		if (paymentService.getLanguageType() == LanguageType.GERMAN) {
			answer = questionPaymentView.showViewGer();
		} else if (paymentService.getLanguageType() == LanguageType.ENGLISH) {
			answer = questionPaymentView.showViewEng();
		}

		switch (answer) {
		case 1:
			PaymentType paymentType = PaymentType.PAYPAL;
			paymentService.setPaymentType(paymentType);
			break;
		case 2:
			paymentType = PaymentType.GOOGLEWALLET;
			paymentService.setPaymentType(paymentType);
			break;
		case 3:
			paymentType = PaymentType.MONEYWALLET;
			paymentService.setPaymentType(paymentType);
			break;
		default:
			action(paymentService);
		}

		return paymentService;

	}
}
