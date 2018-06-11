package de.leuphana.swa.authentificationService;

public class AuthentificationMethodFactory {

	public static AuthenficationMethod getAuthenticationMethod(CredentialType credentialType) {
		switch (credentialType) {
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
		return new EyeScanStrategy();
	}

	private static AuthenficationMethod createFingerPrint() {
		return new FingerPrintStrategy();
	}

	private static AuthenficationMethod createUserName() {
		return new UserNameStrategy();
	}

}
