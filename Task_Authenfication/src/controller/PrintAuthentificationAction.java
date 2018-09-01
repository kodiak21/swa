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

/**<b> Übergeordneter Service</b>: AuthentificationService<br>
 * <b> verbundene Views</b>: PrintAuthentificationView<br>
 * <br>
 * <b>PrintAuthentificationAction:</b> Bestätigung der jeweiligen Authentification<br>
 * 
 * 
 * 
 * 
 * 
 *
 */

public class PrintAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	PrintAuthentificationView printAuthentificationView;

	AuthentificationStrategy authentificationStrategy;

	public PrintAuthentificationAction(Person person, AuthentificationStrategy authentificationStrategy) {
		this.person = person;
		this.authentificationStrategy = authentificationStrategy;
		printAuthentificationView = new PrintAuthentificationView();
	}

	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {

		CredentialType credentialType = authentificationStrategy.getCredentialType();
		
		String password = authentificationService.getPassword();
			
		if (person.getLanguageType() == LanguageType.GERMAN) {
			switch (credentialType) {
			case FINGERPRINT:
				authentificationStrategy = new FingerPrintStrategy();
				printAuthentificationView.showViewGer(authentificationStrategy);
				break;
			case USERNAME:
				authentificationStrategy = new UserNameStrategy(password);
				printAuthentificationView.showViewGer(authentificationStrategy);
				break;
			case EYESCAN:
				authentificationStrategy = new EyeScanStrategy();
				printAuthentificationView.showViewGer(authentificationStrategy);
				break;
			default:
				authentificationStrategy = null;
			}
		}else if(person.getLanguageType() == LanguageType.ENGLISH) {
			switch (credentialType) {
			case FINGERPRINT:
				authentificationStrategy = new FingerPrintStrategy();
				printAuthentificationView.showViewEng(authentificationStrategy);
				break;
			case USERNAME:
				authentificationStrategy = new UserNameStrategy(password);
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
