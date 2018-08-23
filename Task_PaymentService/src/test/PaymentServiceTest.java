package test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controller.PaymentServiceController;
import model.Account;
import model.LanguageType;
import model.PayPalPayment;
import model.Payment;
import model.PaymentService;
import model.PaymentType;

public class PaymentServiceTest {

	private BigDecimal currencyAmount;
	private Account senderAccount;
	private Account receiverAccount;
	private LanguageType languageType;
	private PaymentType paymentType;

	private PaymentServiceController paymentServiceController;
	private PaymentService paymentService;

	private Payment payment;

	@BeforeEach
	void setUp() throws Exception {
		currencyAmount = new BigDecimal("100");
		senderAccount = new Account(8);
		receiverAccount = new Account(1);
		languageType = LanguageType.ENGLISH;
		paymentType = PaymentType.PAYPAL;

		paymentServiceController = new PaymentServiceController();
		paymentService = new PaymentService(languageType);
		
		payment = new PayPalPayment(senderAccount, receiverAccount, currencyAmount, paymentType, languageType);
		paymentService.setPayment(payment);
	}

	@AfterEach
	void tearDown() throws Exception {
		paymentServiceController = null;
		paymentService = null;
	}

	@Test
	@DisplayName("createPayment(Account senderAccount, BigDecimal currencyAmount,PaymentType paymentType, LanguageType languageType): is created Object of Type PayPalPayment")
	void createPayment() {
		assertEquals(true, payment.getClass().getSimpleName().equals("PayPalPayment"));
	}

	@Test
	@DisplayName("deletePayment(): is Payment Object null after delete operation")
	void deletePayment() {
		paymentService.deletePayment();
		assertEquals(null, paymentService.getPayment());
	}

	@Test
	@DisplayName("printPayment(): is PayPalPayment Object returned")
	void printPayment() {
		payment = paymentService.printPayment();
		assertEquals(true, payment.getClass().getSimpleName().equals("PayPalPayment"));
	}

	@Test
	@DisplayName("payMoneyWithPayment(): is Payment transferred and confirmed")
	void payMoneyWithPayment() {

		if(paymentService.getPayment().getLanguageType()==LanguageType.ENGLISH) {
			System.out.println("\n");
			System.out.println("JUnit5-Test: paymentService.payMoneyWithPayment()");
			paymentService.payMoneyWithPayment();	 
		}
	}

	@Test
	@DisplayName("paymentCommand(BigDecimal currencyAmount, Account senderAccount, LanguageType languageType): test of PaymentServiceController (confirmAnswer 1 or 3)")
	void testPaymentServiceController() {
		paymentServiceController.paymentCommand(currencyAmount, senderAccount, languageType);
	}

}
