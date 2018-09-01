package controller;

import model.PaymentService;

/**<b> Übergeordneter Service</b>: PaymentService<br>
 * 
 * <br><b>PaymentServiceAction:</b> Interface, wird in allen betreffenden Aktionen des PaymentService implementiert
 * 
 * 
 *
 */

public interface PaymentServiceAction {
	public PaymentService action(PaymentService paymentService);
}
