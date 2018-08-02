package model;

import java.math.BigDecimal;

public abstract class Payment implements Visitable{
	
	Account senderAccount;
	Account receiverAccount;
	BigDecimal currencyAmount;
	PaymentType paymentType;
	LanguageType languageType;
	
	public Payment(Account senderAccount, Account receiverAccount, BigDecimal currencyAmount, PaymentType paymentType, LanguageType languageType){
		this.senderAccount = senderAccount;
		this.receiverAccount = receiverAccount;
		this.currencyAmount = currencyAmount;
		this.paymentType = paymentType;
		this.languageType = languageType;
	}
	
	abstract void transferMoney(Account sender, Account receiver, BigDecimal amount);
	private void confirmPayment() {
		System.out.println("�NDERN: transaction completed !");
	}
	
	public final void payAmount() {
		
			//transfer money
			transferMoney(senderAccount, receiverAccount, currencyAmount);
			
			//confirm payment
			confirmPayment();
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
	
}
