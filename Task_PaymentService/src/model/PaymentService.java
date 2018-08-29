package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PaymentService {
	
	Payment payment;
	Account senderAccount;
	Account receiverAccount;
	BigDecimal currencyAmount;
	PaymentType paymentType;
	LanguageType languageType;
	List<Payment> payments = new ArrayList<Payment>();
	
	int deleteAnswer;
	
	public PaymentService(LanguageType languageType) {
		this.receiverAccount = new Account(1);
		this.receiverAccount.setAmount(0);
		this.languageType = languageType;
	}
	
	public void createPayment(){
		switch (this.paymentType) {
		case PAYPAL: 		payment = new PayPalPayment(this.senderAccount, this.receiverAccount, this.currencyAmount, this.paymentType, this.languageType);break;
		case GOOGLEWALLET: 	payment = new GoogleWalletPayment(this.senderAccount, this.receiverAccount, this.currencyAmount, this.paymentType, this.languageType);break;
		case MONEYWALLET: 	payment = new MoneyWalletPayment(this.senderAccount, this.receiverAccount, this.currencyAmount, this.paymentType, this.languageType);break;
		default: 			payment = null;break;
		}
		payments.add(payment);
	}
	
	public void createPayment(Account senderAccount, BigDecimal currencyAmount, PaymentType paymentType, LanguageType languageType){
		switch (paymentType) {
		case PAYPAL: 		payment = new PayPalPayment(senderAccount, this.receiverAccount, currencyAmount, paymentType, languageType);break;
		case GOOGLEWALLET: 	payment = new GoogleWalletPayment(senderAccount, this.receiverAccount, currencyAmount, paymentType, languageType);break;
		case MONEYWALLET: 	payment = new MoneyWalletPayment(senderAccount, this.receiverAccount, currencyAmount, paymentType, languageType);break;
		default: 			payment = null;break;
		}
		payments.add(payment);
	}
	
	public void deletePayment(){
		payments.remove(payment);
		payment = null;
	}
	public Payment printPayment(){
		return this.payment;
	}
	public void payMoneyWithPayment() {
		payment.payAmount();
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Account getSenderAccount() {
		return senderAccount;
	}
	public void setSenderAccount(Account senderAccount) {
		this.senderAccount = senderAccount;
	}
	public Account getReceiverAccount() {
		return receiverAccount;
	}
	public void setReceiverAccount(Account receiverAccount) {
		this.receiverAccount = receiverAccount;
	}
	public BigDecimal getCurrencyAmount() {
		return currencyAmount;
	}
	public void setCurrencyAmount(BigDecimal currencyAmount) {
		this.currencyAmount = currencyAmount;
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public LanguageType getLanguageType() {
		return languageType;
	}

	public void setLanguageType(LanguageType languageType) {
		this.languageType = languageType;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setDeleteAnswer(int deleteAnswer) {
		this.deleteAnswer = deleteAnswer;
		
	}
	
	public int getDeleteAnswer() {
		return deleteAnswer;
	}
	
}
