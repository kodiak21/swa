package de.leuphana.swa.authentificationService;

import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;

public class AuthentificationStrategyFactory {

	public static AuthenficationStrategy getAuthenticationMethod(CredentialType credentialType, Person person) {
		if (person.getPersonType() == PersonType.NATURALPERSON) {
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
		} else {
			return createUserName();
		}
	}

	private static AuthenficationStrategy createEyeScan() {
		return new EyeScanStrategy();
	}

	private static AuthenficationStrategy createFingerPrint() {
		return new FingerPrintStrategy();
	}

	private static AuthenficationStrategy createUserName() {
		return new UserNameStrategy();
	}

}
