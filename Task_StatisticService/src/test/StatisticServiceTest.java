package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Account;
import model.StatisticService;
import model.LanguageType;
import model.Payment;
import model.PaymentService;
import model.PaymentType;

class StatisticServiceTest {
	
	List<Payment> payments = new ArrayList<Payment>();

	@BeforeEach
	void setUp() throws Exception {
		
		PaymentService paymentService = new PaymentService();
		
		Account senderAccount;
		BigDecimal currencyAmount;
		PaymentType paymentType;
		LanguageType languageType;
		
		senderAccount = new Account(5);
		currencyAmount = new BigDecimal("500");
		paymentType = PaymentType.MONEYWALLET;
		languageType = LanguageType.ENGLISH;
		
		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b1 = paymentService.getPayment();	
		paymentService.createPayment(senderAccount, currencyAmount, paymentType, languageType);
		Payment b2 = paymentService.getPayment();
		
//		Payment b3 = new EnglishBooking2(200, PaymentType.MONEYWALLET);	
//		Payment b4 = new EnglishBooking2(250, PaymentType.MONEYWALLET);	
//		Payment b5 = new EnglishBooking2(100, PaymentType.MONEYWALLET);	
//		Payment b6 = new EnglishBooking2(100, PaymentType.GOOGLEWALLET);	
//		Payment b7 = new EnglishBooking2(100, PaymentType.GOOGLEWALLET);
//		
//		Payment b8 = new GermanBooking2(100, PaymentType.PAYPAL);
//		Payment b9 = new GermanBooking2(100, PaymentType.PAYPAL);
//		Payment b10 = new GermanBooking2(100, PaymentType.MONEYWALLET);
//		Payment b11 = new GermanBooking2(100, PaymentType.GOOGLEWALLET);
//		Payment b12 = new GermanBooking2(100, PaymentType.GOOGLEWALLET);
		
		payments.add(b1);
		payments.add(b2);
//		bookings.add(b3);
//		bookings.add(b4);
//		bookings.add(b5);
//		bookings.add(b6);
//		bookings.add(b7);
//		bookings.add(b8);
//		bookings.add(b9);
//		bookings.add(b10);
//		bookings.add(b11);
//		bookings.add(b12);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		StatisticService bv = new StatisticService();
//		bv.getEnglishBookingsPaidByGoogleWallet(bookings);
		bv.getEnglishBookingsPaidByMoneyWallet(payments);
//		bv.getEnglishBookingsPaidByPayPal(bookings);
//		bv.getGermanBookingsPaidByGoogleWallet(bookings);
//		bv.getGermanBookingsPaidByMoneyWallet(bookings);
//		bv.getGermanBookingsPaidByPayPal(bookings);
	}

}
