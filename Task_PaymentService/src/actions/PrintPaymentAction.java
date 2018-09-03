package actions;

import model.LanguageType;
import model.PaymentService;
import view.PrintPaymentView;

/**<b> Übergeordneter Service</b>: PaymentService<br>
 * <b> verbundene Views</b>: PrintPaymentView<br>
 * <br>
 * <b>PrintPaymentAction:</b> Informationen des jeweiligen Payments<br>
 * 
 * 
 * 
 * 
 * 
 *
 */

public class PrintPaymentAction implements PaymentServiceAction {

	@Override
	public PaymentService action(PaymentService paymentService) {
		
		PrintPaymentView printPaymentView = new PrintPaymentView();
		if(paymentService.getLanguageType()==LanguageType.GERMAN) {
			printPaymentView.showViewGer(paymentService);
		}else if(paymentService.getLanguageType()==LanguageType.ENGLISH) {
			printPaymentView.showViewEng(paymentService);
		}
		
		return paymentService;
	}

}
