package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controller.StatisticServiceController;
import model.Account;
import model.LanguageType;
import model.Payment;
import model.PaymentService;
import model.PaymentType;
import model.StatisticService;

public class StatisticServiceTest {

	private List<Payment> payments = new ArrayList<Payment>();

	private StatisticServiceController statisticServiceController;
	private StatisticService statisticService;

	@BeforeEach
	void setUp() throws Exception {

		Account senderAccount;
		BigDecimal currencyAmount;
		PaymentType paymentType;
		LanguageType languageType;

		senderAccount = new Account(5);
		currencyAmount = new BigDecimal("444");
		paymentType = PaymentType.MONEYWALLET;
		languageType = LanguageType.ENGLISH;
		PaymentService paymentService = new PaymentService(languageType);

		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b1 = paymentService.getPayment();
		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b2 = paymentService.getPayment();

		paymentType = PaymentType.GOOGLEWALLET;
		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b3 = paymentService.getPayment();

		paymentType = PaymentType.PAYPAL;
		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b4 = paymentService.getPayment();

		languageType = LanguageType.GERMAN;
		currencyAmount = new BigDecimal("555");

		paymentType = PaymentType.MONEYWALLET;
		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b5 = paymentService.getPayment();
		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b6 = paymentService.getPayment();

		paymentType = PaymentType.GOOGLEWALLET;
		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b7 = paymentService.getPayment();

		paymentType = PaymentType.PAYPAL;
		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b8 = paymentService.getPayment();

		payments.add(b1);
		payments.add(b2);
		payments.add(b3);
		payments.add(b4);
		payments.add(b5);
		payments.add(b6);
		payments.add(b7);
		payments.add(b8);

		statisticServiceController = new StatisticServiceController();
		statisticService = new StatisticService();
	}

	@AfterEach
	void tearDown() throws Exception {
		statisticServiceController = null;
		statisticService = null;
	}

	@Test
	@DisplayName("statisticCommand(List<Payments> payments, LanguageType languageType): test of StatisticServiceController (confirmAnswer 1 or 3)")
	void testStatisticServiceController() {
		LanguageType languageType = LanguageType.GERMAN;

		statisticService = statisticServiceController.statisticCommand(payments, languageType);

	}

}
