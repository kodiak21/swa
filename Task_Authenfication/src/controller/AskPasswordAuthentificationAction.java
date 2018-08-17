package controller;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.AskPassWordView;

public class AskPasswordAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	private AskPassWordView askPassWordView;
	
	public AskPasswordAuthentificationAction(Person person) {
		this.person = person;
		this.askPassWordView = new AskPassWordView();
	}
	
	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		if(person.getLanguageType()==LanguageType.GERMAN) {
			authentificationService.setPasswordAnswer(askPassWordView.showViewGer());
		}else if(person.getLanguageType()==LanguageType.ENGLISH) {
			authentificationService.setPasswordAnswer(askPassWordView.showViewEng());
		}
		return authentificationService;
	}

}
