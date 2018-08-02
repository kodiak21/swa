package test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import controller.PaymentServiceController;
import model.Account;

class PaymentServiceTest {

	BigDecimal currencyAmount = new BigDecimal("1000");
	Account senderAccount = new Account(8);
	
	@Test
	void test() {
		PaymentServiceController paymentServiceController = new PaymentServiceController();
		paymentServiceController.paymentCommand(currencyAmount, senderAccount);
	}

}
