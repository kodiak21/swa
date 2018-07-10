package controller;

import model.PaymentService;
import view.PrintPaymentView;

public class PrintPaymentAction implements PaymentServiceAction {

	@Override
	public PaymentService action(PaymentService paymentService) {
		
		PrintPaymentView view = new PrintPaymentView();
		view.showView(paymentService);
		
		return paymentService;
	}

}
