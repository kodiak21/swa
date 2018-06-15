package de.leuphana.swa.authentificationService;

public class Client {

	//Authenfication nach Strategy Pattern
	
	public static void main(String[] args ) {

		Subject subject;
		subject = Subject.NATURALPERSON;
		
		CredentialType credentialType;
		credentialType = CredentialType.USERNAME;

		AuthenficationMethod authenficationMethod = AuthentificationMethodFactory.getAuthenticationMethod(credentialType, subject);

		authenficationMethod.authenficateSubject();
	}
}
