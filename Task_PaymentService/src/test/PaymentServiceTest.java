package test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import controller.PaymentServiceController;
import model.Account;
import model.LanguageType;

class PaymentServiceTest {

	BigDecimal currencyAmount = new BigDecimal("1000");
	Account senderAccount = new Account(8);
	LanguageType languageType = LanguageType.ENGLISH;
	
	@Test
	void test() {
		PaymentServiceController paymentServiceController = new PaymentServiceController();
		paymentServiceController.paymentCommand(currencyAmount, senderAccount, languageType);
	}

}
