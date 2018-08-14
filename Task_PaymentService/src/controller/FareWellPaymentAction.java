package controller;

import model.LanguageType;
import model.PaymentService;
import view.FareWellPaymentView;

public class FareWellPaymentAction implements PaymentServiceAction {

	private FareWellPaymentView fareWellPaymentView;
	
	public FareWellPaymentAction() {
		this.fareWellPaymentView = new FareWellPaymentView();
	}
	
	@Override
	public PaymentService action(PaymentService paymentService) {
		
		if(paymentService.getLanguageType()==LanguageType.GERMAN) {
			fareWellPaymentView.showViewGer();
			System.exit(0);
		}else if(paymentService.getLanguageType()==LanguageType.ENGLISH) {
			fareWellPaymentView.showViewEng();
			System.exit(0);
		}
		
		return paymentService;
	}

}
