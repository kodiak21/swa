package model;

import de.leuphana.swa.authentificationService.CredentialType;

public class PaymentService {
	
	Payment payment;
	Account senderAccount;
	Account receiverAccount;
	float currencyAmount;
	CredentialType credentialType;
	PaymentType paymentType;
	
	public PaymentService() {
		this.receiverAccount = new Account(1);
		this.receiverAccount.setAmount(0);
	}
	
	public void createPayment(Account senderAccount, float currencyAmount, CredentialType credentialType, PaymentType paymentType){
		switch (paymentType) {
		case PAYPAL: 		payment = new PayPalPayment(senderAccount, this.receiverAccount, currencyAmount, credentialType, paymentType);break;
		case GOOGLEWALLET: 	payment = new GoogleWalletPayment(senderAccount, this.receiverAccount, currencyAmount, credentialType, paymentType);break;
		case MONEYWALLET: 	payment = new MoneyWalletPayment(senderAccount, this.receiverAccount, currencyAmount, credentialType, paymentType);break;
		default: 			payment = null;break;
		}
	}
	public void createPayment(){
		switch (this.paymentType) {
		case PAYPAL: 		payment = new PayPalPayment(this.senderAccount, this.receiverAccount, this.currencyAmount, this.credentialType, this.paymentType);break;
		case GOOGLEWALLET: 	payment = new GoogleWalletPayment(this.senderAccount, this.receiverAccount, this.currencyAmount, this.credentialType, this.paymentType);break;
		case MONEYWALLET: 	payment = new MoneyWalletPayment(this.senderAccount, this.receiverAccount, this.currencyAmount, this.credentialType, this.paymentType);break;
		default: 			payment = null;break;
		}
	}
	public void deletePayment(){
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
	public float getCurrencyAmount() {
		return currencyAmount;
	}
	public void setCurrencyAmount(float currencyAmount) {
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
