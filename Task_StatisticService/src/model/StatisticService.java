package model;

import java.math.BigDecimal;
import java.util.List;

public class StatisticService extends Visitor {

	BigDecimal payAmountTotal;
	LanguageType languageType;
	int bookingCount;
	PaymentType paymentType;
	List<Payment> payments;
	
	int deleteAnswer;
	
	public StatisticService() {

		this.bookingCount = 0;
		this.payAmountTotal = new BigDecimal("0");
		this.languageType = null;
		this.paymentType = null;
		this.payments = null;
	}
	
	public void setGermanBookingsPaidByPayPal (List<Payment> payments) {
		this.bookingCount = 0;
		this.payAmountTotal =  new BigDecimal("0");
		this.languageType = null;
		this.languageType = LanguageType.GERMAN;
		this.paymentType = PaymentType.PAYPAL;
		this.payments = payments;
		
		for(Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.GERMAN && payment instanceof PayPalPayment) {
				payment.accept(this);
			}
		}
	}
	public void setGermanBookingsPaidByGoogleWallet (List<Payment> payments) {
		this.bookingCount = 0;
		this.payAmountTotal =  new BigDecimal("0");
		this.languageType = null;
		this.languageType = LanguageType.GERMAN;
		this.paymentType = PaymentType.GOOGLEWALLET;
		this.payments = payments;
		
		for(Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.GERMAN && payment instanceof GoogleWalletPayment) {
				payment.accept(this);
			}
		}
	}
	public void setGermanBookingsPaidByMoneyWallet (List<Payment> payments) {
		this.bookingCount = 0;
		this.payAmountTotal =  new BigDecimal("0");
		this.languageType = null;
		this.languageType = LanguageType.GERMAN;
		this.paymentType = PaymentType.MONEYWALLET;
		this.payments = payments;
		
		for(Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.GERMAN && payment instanceof MoneyWalletPayment) {
				payment.accept(this);
			}
		}
	}
	public void setEnglishBookingsPaidByPayPal (List<Payment> payments) {
		this.bookingCount = 0;
		this.payAmountTotal =  new BigDecimal("0");
		this.languageType = null;
		this.languageType = LanguageType.ENGLISH;
		this.paymentType = PaymentType.PAYPAL;
		this.payments = payments;
		
		for(Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.ENGLISH && payment instanceof PayPalPayment) {
				payment.accept(this);
			}
		}
	}
	public void setEnglishBookingsPaidByGoogleWallet (List<Payment> payments) {
		this.bookingCount = 0;
		this.payAmountTotal =  new BigDecimal("0");
		this.languageType = null;
		this.languageType = LanguageType.ENGLISH;
		this.paymentType = PaymentType.GOOGLEWALLET;
		this.payments = payments;
		
		for(Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.ENGLISH && payment instanceof GoogleWalletPayment) {
				payment.accept(this);
			}
		}
	}
	public void setEnglishBookingsPaidByMoneyWallet (List<Payment> payments) {
		this.bookingCount = 0;
		this.payAmountTotal =  new BigDecimal("0");
		this.languageType = null;
		this.languageType = LanguageType.ENGLISH;
		this.paymentType = PaymentType.MONEYWALLET;
		this.payments = payments;
		
		for(Payment payment : payments) {
			if (payment.getLanguageType() == LanguageType.ENGLISH && payment instanceof MoneyWalletPayment) {
				payment.accept(this);
			}
		}
	}
	
	public BigDecimal getPayAmountTotal() {
		return payAmountTotal;
	}
	public LanguageType getLanguageType() {
		return languageType;
	}
	public int getBookingCount() {
		return bookingCount;
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	

	@Override
	void visit(PayPalPayment payPalPayment) {
		this.payAmountTotal = payPalPayment.getCurrencyAmount().add(payAmountTotal);
		bookingCount++;
	}
	@Override
	void visit(MoneyWalletPayment moneyWalletPayment) {
		this.payAmountTotal = moneyWalletPayment.getCurrencyAmount().add(payAmountTotal);
		bookingCount++;	
	}
	@Override
	void visit(GoogleWalletPayment googleWalletPayment) {
		this.payAmountTotal = googleWalletPayment.getCurrencyAmount().add(payAmountTotal);
		bookingCount++;
	}

	public void deleteStatistic() {
		this.bookingCount = 0;
		this.payAmountTotal = new BigDecimal("0");
		this.languageType = null;
		this.paymentType = null;
		this.payments = null;
		
	}

	public void setDeleteAnswer(int deleteAnswer) {
		this.deleteAnswer = deleteAnswer;
		
	}
	
	public int getDeleteAnswer() {
		return deleteAnswer;
	}

}
