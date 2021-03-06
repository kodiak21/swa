package model;

import model.Person;
import model.PersonType;

public class AuthentificationStrategyFactory {

	public static AuthentificationStrategy getAuthenticationMethod(CredentialType credentialType, Person person, AuthentificationService authentificationService) {
		
		String password = authentificationService.getPassword();
		
		if (person.getPersonType() == PersonType.NATURALPERSON) {
			switch (credentialType) {
			case USERNAME:
				return createUserName(password);
			case FINGERPRINT:
				return createFingerPrint();
			case EYESCAN:
				return createEyeScan();
			default:
				return null;
			}
		} else {
			return createUserName(password);
		}
	}

	private static AuthentificationStrategy createEyeScan() {
		return new EyeScanStrategy();
	}

	private static AuthentificationStrategy createFingerPrint() {
		return new FingerPrintStrategy();
	}

	private static AuthentificationStrategy createUserName(String password) {
		return new UserNameStrategy(password);
	}

}
