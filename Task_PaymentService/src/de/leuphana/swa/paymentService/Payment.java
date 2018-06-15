package de.leuphana.swa.paymentService;

import de.leuphana.swa.authentificationService.AuthenficationMethod;
import de.leuphana.swa.authentificationService.AuthentificationMethodFactory;
import de.leuphana.swa.authentificationService.Subject;
import de.leuphana.swa.authentificationService.CredentialType;

public abstract class Payment {
	
	private boolean authenficateUser(CredentialType credentialType, Account senderAccount) {
		boolean authentificatet;
		Subject subject;
		
		//TODO muss noch variabel gestaltet werden, Einbindung von Authentification Subject bzw PersonService-PErson
		subject = Subject.NATURALPERSON;
		
		AuthenficationMethod authenficationMethod = AuthentificationMethodFactory.getAuthenticationMethod(credentialType, subject);
		authentificatet = authenficationMethod.authenficateSubject();
		
		return authentificatet;
	};
	abstract void transferMoney(Account sender, Account receiver, float amount);
	private void confirmPayment() {
		System.out.println("transaction completed !");
	}
	
	public final void payAmount(Account senderAccount, Account receiverAccount, float amount, CredentialType credentialType) {
		
		//authenficate User
		authenficateUser(credentialType, senderAccount);
		
		//transfer money
		transferMoney(senderAccount, receiverAccount, amount);
		
		//confirm payment
		confirmPayment();
		
	}
}
