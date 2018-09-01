package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controller.StatisticServiceController;
import model.Account;
import model.GoogleWalletPayment;
import model.LanguageType;
import model.MoneyWalletPayment;
import model.PayPalPayment;
import model.Payment;
import model.PaymentService;
import model.PaymentType;
import model.StatisticService;

/**<b> Übergeordneter Service</b>: StatisticService<br>
 * 
 * <br>
 * <b>StatisticServiceTest:</b> Testet alle wichtigen Funktionen von StatisticService<br>
 * 
 *<br><b> getestete Methoden:</b><br>
 *
 *<br>- setGermanBookingsPaidByPayPal() - erfasst alle deutschen Bezahlungen mit PayPal<br>
 *- setGermanBookingsPaidByGoogleWallet() - erfasst alle deutschen Bezahlungen mit GoogleWallet <br>
 *- setGermanBookingsPaidByMoneyWallet() - erfasst alle deutschen Bezahlungen mit MoneyWallet <br>
 *- setEnglishBookingsPaidByPayPal() - erfasst alle englischen Bezahlungen mit PayPal<br>
 *- setEnglishBookingsPaidByGoogleWallet() - erfasst alle englischen Bezahlungen mit GoogleWallet<br>
 *- setEnglishBookingsPaidByMoneyWallet() - erfasst alle englischen Bezahlungen mit MoneyWallet<br>
 *- getPayAmountTotal() - berechnet Gesamtbetrag<br>
 *- deleteStatistic() - löscht auf Anfrage Statistik
 *
 */

public class StatisticServiceTest {

	private List<Payment> payments = new ArrayList<Payment>();

	private StatisticServiceController statisticServiceController;
	private StatisticService statisticService;

	private int count;
	private BigDecimal payAmountTotal;

	@BeforeEach
	void setUp() throws Exception {

		Account senderAccount;
		BigDecimal currencyAmount;
		PaymentType paymentType;
		LanguageType languageType;
		count = 0;
		payAmountTotal = BigDecimal.ZERO;

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
		payments = null;
		count = 0;
		payAmountTotal = BigDecimal.ZERO;
	}

	@Test
	@DisplayName("setGermanBookingsPaidByPayPal (List<Payment> payments): is number of German Paypal payments 1")
	void setGermanBookingsPaidByPayPal() {
		for (Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.GERMAN && payment instanceof PayPalPayment) {
				count++;
			}
		}

		assertEquals(1, count);

	}

	@Test
	@DisplayName("setGermanBookingsPaidByGoogleWallet (List<Payment> payments): is number of German GoogleWallet payments 1")
	void setGermanBookingsPaidByGoogleWallet() {

		for (Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.GERMAN && payment instanceof GoogleWalletPayment) {
				count++;
			}
		}

		assertEquals(1, count);
	}

	@Test
	@DisplayName("setGermanBookingsPaidByMoneyWallet (List<Payment> payments): is number of German MoneyWallet payments 2")
	void setGermanBookingsPaidByMoneyWallet() {
		for (Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.GERMAN && payment instanceof MoneyWalletPayment) {
				count++;
			}
		}

		assertEquals(2, count);
	}

	@Test
	@DisplayName("setEnglishBookingsPaidByPayPal (List<Payment> payments): is number of English PayPal payments 1")
	void setEnglishBookingsPaidByPayPal() {
		for (Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.ENGLISH && payment instanceof PayPalPayment) {
				count++;
			}
		}

		assertEquals(1, count);
	}

	@Test
	@DisplayName("setEnglishBookingsPaidByGoogleWallet (List<Payment> payments): is number of English GoogleWallet payments 1")
	void setEnglishBookingsPaidByGoogleWallet() {
		for (Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.ENGLISH && payment instanceof GoogleWalletPayment) {
				count++;
			}
		}

		assertEquals(1, count);
	}

	@Test
	@DisplayName("setEnglishBookingsPaidByMoneyWallet (List<Payment> payments): is number of English MoneyWallet payments 2")
	void setEnglishBookingsPaidByMoneyWallet() {
		for (Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.ENGLISH && payment instanceof MoneyWalletPayment) {
				count++;
			}
		}

		assertEquals(2, count);
	}

	@Test
	@DisplayName("getPayAmountTotal(): is total amount of PayPal payments 999")
	void getPayAmountTotal1() {
		for (Payment payment : payments) {
			if (payment instanceof PayPalPayment)
				this.payAmountTotal = payment.getCurrencyAmount().add(payAmountTotal);
		}

		assertEquals(new BigDecimal("999"), payAmountTotal);
	}

	@Test
	@DisplayName("getPayAmountTotal(): is total amount of GoogleWallet payments 999")
	void getPayAmountTotal2() {
		for (Payment payment : payments) {
			if (payment instanceof GoogleWalletPayment)
				this.payAmountTotal = payment.getCurrencyAmount().add(payAmountTotal);
		}

		assertEquals(new BigDecimal("999"), payAmountTotal);
	}

	@Test
	@DisplayName("getPayAmountTotal(): is total amount of MoneyWallet payments 1998")
	void getPayAmountTotal3() {
		for (Payment payment : payments) {
			if (payment instanceof MoneyWalletPayment)
				this.payAmountTotal = payment.getCurrencyAmount().add(payAmountTotal);
		}

		assertEquals(new BigDecimal("1998"), payAmountTotal);
	}

	@Test
	@DisplayName("deleteStatistic(): is payAmountTotal 0 after delete operation")
	void deleteStatistic() {
		for (Payment payment : payments) {

			this.payAmountTotal = payment.getCurrencyAmount().add(payAmountTotal);
		}
		
		statisticService.deleteStatistic();
		
		assertEquals(BigDecimal.ZERO, statisticService.getPayAmountTotal());
	}

}
