package model;

import java.math.BigDecimal;

public abstract class Payment {
	
	Account senderAccount;
	Account receiverAccount;
	BigDecimal currencyAmount;
	CredentialType credentialType;
	PaymentType paymentType;
	
	public Payment(Account senderAccount, Account receiverAccount, BigDecimal currencyAmount, CredentialType credentialType, PaymentType paymentType){
		this.senderAccount = senderAccount;
		this.receiverAccount = receiverAccount;
		this.currencyAmount = currencyAmount;
		this.credentialType = credentialType;
		this.paymentType = paymentType;
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

	public CredentialType getCredentialType() {
		return credentialType;
	}

	public void setCredentialType(CredentialType credentialType) {
		this.credentialType = credentialType;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	
}
