package controller;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.SetPasswordView;

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
