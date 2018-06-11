package de.leuphana.swa.authentificationService;

public class Client {

	//Authenfication nach Strategy Pattern
	
	public static void main(String[] args ) {

		CredentialType credentialType;
		credentialType = CredentialType.USERNAME;

		AuthenficationMethod authenficationMethod = AuthentificationMethodFactory.getAuthenticationMethod(credentialType);

		authenficationMethod.authenficateSubject();
	}
}
