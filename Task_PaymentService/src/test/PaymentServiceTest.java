package test;

import org.junit.jupiter.api.Test;

import controller.PaymentServiceController;

class PaymentServiceTest {

	@Test
	void test() {
		PaymentServiceController paymentServiceController = new PaymentServiceController();
		paymentServiceController.paymentCommand();
	}

}
