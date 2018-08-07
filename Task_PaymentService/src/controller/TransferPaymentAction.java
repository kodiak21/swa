package controller;

import java.util.List;

import model.Payment;
import model.PaymentService;

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
