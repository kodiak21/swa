package de.leuphana.swa.paymentService;

public abstract class Payment {
	
	private float amount;
	private Account sender;
	private Account receiver;

	abstract void authenficateUser(CredentialType credentialType);
	abstract void transferMoney(Account sender, Account receiver, float amount);
	abstract void confirmPayment();
	
	public final void payAmount(Account sender, Account receiver, float amount, CredentialType credentialType) {
		
		//authenficate User
		authenficateUser(credentialType);
		
		//transfer money
		transferMoney(sender, receiver, amount);
		
		//confirm payment
		confirmPayment();
		
	}
}
