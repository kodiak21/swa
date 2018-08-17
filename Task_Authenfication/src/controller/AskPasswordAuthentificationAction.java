package controller;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.AskPasswordView;

public class AskPasswordAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	private AskPasswordView askPasswordView;
	
	public AskPasswordAuthentificationAction(Person person) {
		this.person = person;
		this.askPasswordView = new AskPasswordView();
	}

	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		if(person.getLanguageType()==LanguageType.GERMAN) {
			authentificationService.setPasswordAnswer(askPasswordView.showViewGer());
		}else if(person.getLanguageType()==LanguageType.ENGLISH) {
			authentificationService.setPasswordAnswer(askPasswordView.showViewEng());
		}
		return authentificationService;
	}

}
