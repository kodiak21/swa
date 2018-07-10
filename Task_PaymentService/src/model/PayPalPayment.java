package model;

import de.leuphana.swa.authentificationService.CredentialType;

public class PayPalPayment extends Payment {
	
	public PayPalPayment(Account senderAccount, Account receiverAccount, float currencyAmount,
			CredentialType credentialType, PaymentType paymentType) {
		super(senderAccount, receiverAccount, currencyAmount, credentialType, paymentType);
		// TODO Auto-generated constructor stub
	}

	@Override
	void transferMoney(Account sender, Account receiver, float amount) {
		System.out.println("PayPal is choosen !");
		System.out.println(amount + " will be transfered from " 
				+ sender.getAccountNumber() 
				+ " to "
				+ receiver.getAccountNumber());
		
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	
	
	

}
