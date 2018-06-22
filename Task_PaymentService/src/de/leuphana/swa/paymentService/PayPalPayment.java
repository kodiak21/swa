package de.leuphana.swa.paymentService;

import de.leuphana.swa.authentificationService.CredentialType;

public class PayPalPayment extends Payment {


	public PayPalPayment(Account senderAccount, Account receiverAccount, float currencyAmount,
			CredentialType credentialType) {
		super(senderAccount, receiverAccount, currencyAmount, credentialType);
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

	
	
	

}
