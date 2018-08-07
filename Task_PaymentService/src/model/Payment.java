package model;

import java.math.BigDecimal;

import view.ConfirmPaymentView;

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
	
	abstract void transferMoney(Account sender, Account receiver, BigDecimal amount, LanguageType languageType);
	
	private void confirmPayment() {
		
		ConfirmPaymentView confirmPaymentView = new ConfirmPaymentView();
		
		if(languageType == LanguageType.GERMAN) {
			confirmPaymentView.showViewGer();
		}else if(languageType == LanguageType.ENGLISH) {
			confirmPaymentView.showViewEng();
		}
	}
	
	public final void payAmount() {
		
			//transfer money
			transferMoney(senderAccount, receiverAccount, currencyAmount, languageType);
			
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
