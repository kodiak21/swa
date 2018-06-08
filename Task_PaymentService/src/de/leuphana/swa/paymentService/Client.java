package de.leuphana.swa.paymentService;

public class Client {

	// PaymentService nach Template Pattern
	
	public static void main(String[] args) {
		
		Payment payment = new PayPalPayment();
		
		Account sender = new Account(1000);
		Account receiver = new Account(2000);
		
		float amount = 500;
		
		CredentialType credentialtype = CredentialType.EYESCAN;
		
		payment.payAmount(sender, receiver, amount, credentialtype);
		
		
	}

}
