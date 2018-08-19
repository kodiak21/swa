package controller;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.AskPasswordAuthentificationView;

public class AskPasswordAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	private AskPasswordAuthentificationView askPasswordAuthentificationView;
	
	public AskPasswordAuthentificationAction(Person person) {
		this.person = person;
		this.askPasswordAuthentificationView = new AskPasswordAuthentificationView();
	}

	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		if(person.getLanguageType()==LanguageType.GERMAN) {
			authentificationService.setPasswordAnswer(askPasswordAuthentificationView.showViewGer());
		}else if(person.getLanguageType()==LanguageType.ENGLISH) {
			authentificationService.setPasswordAnswer(askPasswordAuthentificationView.showViewEng());
		}
		return authentificationService;
	}

}
