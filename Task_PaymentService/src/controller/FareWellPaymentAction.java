package controller;

import model.LanguageType;
import model.PaymentService;
import view.FareWellPaymentView;

/**<b> Übergeordneter Service</b>: PaymentService<br>
 * <b> verbundene Views</b>: FareWellPaymentView<br>
 * <br><b>FareWellPaymentAction:</b> Der Kunde wird verabschiedet bei Abbruch des PaymentService
 * 
 * 
 *
 */

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
