package controller;

import model.AuthentificationService;
import model.AuthentificationStrategy;
import model.LanguageType;
import model.Person;
import view.ConfirmAuthentificationView;

public class ConfirmAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	ConfirmAuthentificationView confirmAuthentificationView;

	public ConfirmAuthentificationAction(Person person) {
		this.person = person;
		this.confirmAuthentificationView = new ConfirmAuthentificationView();
	}

	@Override

	public AuthentificationService action(AuthentificationService authentificationService) {

		AuthentificationStrategy authentificationStrategy = authentificationService.getAuthentificationStrategy();

		if (person.getLanguageType() == LanguageType.GERMAN) {
			confirmAuthentificationView.showViewGer(authentificationStrategy);
		} else if (person.getLanguageType() == LanguageType.ENGLISH) {
			confirmAuthentificationView.showViewEng(authentificationStrategy);
		}

		return authentificationService;
	}

}
