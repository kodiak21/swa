package actions;

import java.util.List;

import model.Payment;
import model.PaymentService;

/**<b> Übergeordneter Service</b>: PaymentService<br>
 * 
 * <br>
 * <b>TransferPaymentAction:</b> Durchführung des Payments<br>
 * 
 * 
 * 
 * 
 *
 */

public class TransferPaymentAction implements PaymentServiceAction {

	@Override
	public PaymentService action(PaymentService paymentService) {

		List<Payment> payments = paymentService.getPayments();

		for (Payment payment : payments) {
			payment.payAmount();
		}

		return paymentService;

	}

}
