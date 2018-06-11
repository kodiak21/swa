package de.leuphana.swa.authentificationService;

public class Client {

	//Authenfication nach Strategy Pattern
	
	public static void main(String[] args ) {
		
		CredentialType credentialType = CredentialType.FINGERPRINT;
		
		AuthenficationMethod text = AuthentificationMethodFactory.getAuthenticationMethod(credentialType);

		if(credentialType == CredentialType.EYESCAN || credentialType == CredentialType.FINGERPRINT)
			System.out.println(text);
	}
}
