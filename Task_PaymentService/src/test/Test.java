package test;
import controller.PaymentServiceController;
import model.PaymentService;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		PaymentServiceController psc = new PaymentServiceController();
		PaymentService paymentService;
		paymentService = psc.paymentCommand();
		
	}

}
