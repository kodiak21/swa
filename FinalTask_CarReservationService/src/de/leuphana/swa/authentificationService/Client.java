package de.leuphana.swa.authentificationService;

public class Client {

	//Authenfication nach Strategy Pattern
	
	public static void main(String[] args ) {
		
		CredentialType credentialType = CredentialType.USERNAME;
		
		AuthenficationMethod text = AuthentificationMethodFactory.getAuthenticationMethod(credentialType);

		System.out.println(text);
	}
}
