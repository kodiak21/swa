package de.leuphana.swa.paymentService;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import de.leuphana.swa.authentificationService.AuthentificationStrategyFactory;
import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;
import de.leuphana.swa.personService.UserFactory;
import de.leuphana.swa.authentificationService.CredentialType;

public abstract class Payment {
	
	Account senderAccount;
	Account receiverAccount;
	float currencyAmount;
	CredentialType credentialType;
	
	public Payment(Account senderAccount, Account receiverAccount, float currencyAmount, CredentialType credentialType){
		this.senderAccount = senderAccount;
		this.receiverAccount = receiverAccount;
		this.currencyAmount = currencyAmount;
		this.credentialType = credentialType;
	}
	
	private boolean authentificateUser(CredentialType credentialType, Account senderAccount) {
		boolean authentificatet;
		
		//TODO muss noch variabel gestaltet werden, Einbindung von Authentification Subject bzw PersonService-PErson
		UserFactory userfactory = new UserFactory();
		Person person = userfactory.createPerson(PersonType.NATURALPERSON,"Hans");
		
		AuthenficationStrategy authenficationMethod = AuthentificationStrategyFactory.getAuthenticationMethod(credentialType, person);
		authentificatet = authenficationMethod.authenficateSubject();
		
		return authentificatet;
	};
	abstract void transferMoney(Account sender, Account receiver, float amount);
	private void confirmPayment() {
		System.out.println("transaction completed !");
	}
	
	public final void payAmount() {
		
			//authenficate User
		if (authentificateUser(credentialType, senderAccount)) {
		
			//transfer money
			transferMoney(senderAccount, receiverAccount, currencyAmount);
			
			//confirm payment
			confirmPayment();
			
		} else {
			System.out.println("transaction failed, user not authentificated!");
		}
	}
}
