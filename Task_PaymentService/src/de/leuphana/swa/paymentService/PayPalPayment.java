package de.leuphana.swa.paymentService;

public class PayPalPayment extends Payment {

	@Override
	void authenficateUser(CredentialType credentialType) {
		System.out.print("User is identified ");
		
		try {
		switch(credentialType) {
		case USERNAME:
			System.out.print("via Username\n");
			break;
		case FINGERPRINT:
			System.out.print("via fingerprint\n");
			break;
		case EYESCAN:
			System.out.print("via eyescan\n");
			break;
		default:
			break;
		}}catch(Exception e) {
			e.getMessage();
		}
	}
	
	@Override
	void transferMoney(Account sender, Account receiver, float amount) {
		System.out.println("PayPal is choosen !");
		System.out.println(amount + " will be transfered from " 
				+ sender.getAccountNumber() 
				+ " to "
				+ receiver.getAccountNumber());
		
	}

	@Override
	void confirmPayment() {
		System.out.println("transaction completed !");

	}

	
	
	

}
