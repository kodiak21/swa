package de.leuphana.swa.paymentService;

import de.leuphana.swa.authentificationService.CredentialType;

public class Client {

	// PaymentService nach Template Pattern
	
	public static void main(String[] args) {
		
		Account sender = new Account(1000);
		Account receiver = new Account(2000);
		float amount = 500;
		CredentialType credentialtype = CredentialType.EYESCAN;
		
		Payment payment = new PayPalPayment(sender, receiver, amount, credentialtype);
		payment.payAmount();
		
		
	}

}
