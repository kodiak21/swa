package controller;

import model.AuthentificationService;
import model.AuthentificationStrategy;
import model.CredentialType;
import model.EyeScanStrategy;
import model.FingerPrintStrategy;
import model.LanguageType;
import model.Person;
import model.UserNameStrategy;
import view.PrintAuthentificationView;

public class PrintAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	PrintAuthentificationView printAuthentificationView;
	CredentialType credentialType;

	AuthentificationStrategy authentificationStrategy;

	public PrintAuthentificationAction(CredentialType credentialType, Person person) {
		this.credentialType = credentialType;
		this.person = person;
		printAuthentificationView = new PrintAuthentificationView();
	}

	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {

		if (person.getLanguage() == LanguageType.GERMAN) {
			switch (credentialType) {
			case FINGERPRINT:
				authentificationStrategy = new FingerPrintStrategy();
				printAuthentificationView.showViewGer(authentificationStrategy);
				break;
			case USERNAME:
				authentificationStrategy = new UserNameStrategy();
				printAuthentificationView.showViewGer(authentificationStrategy);
				break;
			case EYESCAN:
				authentificationStrategy = new EyeScanStrategy();
				printAuthentificationView.showViewGer(authentificationStrategy);
				break;
			default:
				authentificationStrategy = null;
			}
		}else if(person.getLanguage() == LanguageType.ENGLISH) {
			switch (credentialType) {
			case FINGERPRINT:
				authentificationStrategy = new FingerPrintStrategy();
				printAuthentificationView.showViewEng(authentificationStrategy);
				break;
			case USERNAME:
				authentificationStrategy = new UserNameStrategy();
				printAuthentificationView.showViewEng(authentificationStrategy);
				break;
			case EYESCAN:
				authentificationStrategy = new EyeScanStrategy();
				printAuthentificationView.showViewEng(authentificationStrategy);
				break;
			default:
				authentificationStrategy = null;
			}
		}
		return authentificationService;

	}

}
