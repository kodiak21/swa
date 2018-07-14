package model;

import model.Person;
import model.PersonType;
import model.UserFactory;

public abstract class Payment {
	
	Account senderAccount;
	Account receiverAccount;
	float currencyAmount;
	CredentialType credentialType;
	PaymentType paymentType;
	
	public Payment(Account senderAccount, Account receiverAccount, float currencyAmount, CredentialType credentialType, PaymentType paymentType){
		this.senderAccount = senderAccount;
		this.receiverAccount = receiverAccount;
		this.currencyAmount = currencyAmount;
		this.credentialType = credentialType;
		this.paymentType = paymentType;
	}
	
	private boolean authentificateUser(CredentialType credentialType, Account senderAccount) {
		boolean authentificated = false;
		
		//TODO muss noch variabel gestaltet werden, Einbindung von Authentification Subject bzw PersonService-PErson
		UserFactory userfactory = new UserFactory();
		Person person = userfactory.createPerson(PersonType.NATURALPERSON,"Hans", LanguageType.GERMAN);
		
		AuthentificationStrategy authenficationMethod = AuthentificationStrategyFactory.getAuthenticationMethod(credentialType, person);
		if(person.getLanguage()==LanguageType.GERMAN) {
			authentificated = authenficationMethod.authenficateSubjectGer();
		}else if(person.getLanguage()==LanguageType.ENGLISH) {
			authentificated = authenficationMethod.authenficateSubjectEng();
		}
		
		return authentificated;
	};
	abstract void transferMoney(Account sender, Account receiver, float amount);
	private void confirmPayment() {
		System.out.println("�NDERN: transaction completed !");
	}
	
	public final void payAmount() {
		
			//authenficate User
		if (authentificateUser(credentialType, senderAccount)) {
		
			//transfer money
			transferMoney(senderAccount, receiverAccount, currencyAmount);
			
			//confirm payment
			confirmPayment();
			
		} else {
			System.out.println("�NDERN: transaction failed, user not authentificated!");
		}
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
