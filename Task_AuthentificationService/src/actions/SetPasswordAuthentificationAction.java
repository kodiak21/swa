package actions;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.SetPasswordView;

/**<b> Übergeordneter Service</b>: AuthentificationService<br>
 * <b> verbundene Views</b>: SetPasswordView<br>
 * 
 * <br>
 * <b>SetPasswordAuthentificationAction:</b> Neues Passwort kann vom Kunden gesetzt werden<br>
 * 
 * 
 * 
 * 
 * 
 *
 */

public class SetPasswordAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	String password;
	private SetPasswordView setPasswordView;

	public SetPasswordAuthentificationAction(Person person) {
		this.person = person;
		this.setPasswordView = new SetPasswordView();
	}

	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		if (person.getLanguageType() == LanguageType.GERMAN) {

			authentificationService.setPassword(setPasswordView.showViewGer());

		} else if (person.getLanguageType() == LanguageType.ENGLISH) {

			authentificationService.setPassword(setPasswordView.showViewEng());

		}
		return authentificationService;
	}

}
