package de.leuphana.swa.authentificationService;

public class AuthentificationMethodFactory {
	
	public static AuthenficationMethod getAuthenticationMethod(CredentialType credentialType) {
		switch(credentialType) {
		case USERNAME:
			return createUserName();
		case FINGERPRINT:
			return createFingerPrint();
		case EYESCAN:
			return createEyeScan();
		default:
			return null;
		}
	}

	private static AuthenficationMethod createEyeScan() {
		return new EyeScan();
	}

	private static AuthenficationMethod createFingerPrint() {
		return new FingerPrint();
	}

	private static AuthenficationMethod createUserName() {
		return new UserName();
	}
	
}
