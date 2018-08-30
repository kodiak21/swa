package controller;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.EnterPasswordAuthentificationView;

public class EnterPasswordAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	String password;
	private EnterPasswordAuthentificationView enterPasswordAuthentificationView;

	public EnterPasswordAuthentificationAction(Person person) {
		this.person = person;
		this.enterPasswordAuthentificationView = new EnterPasswordAuthentificationView();
	}
	
	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		if(person.getLanguageType()==LanguageType.GERMAN) {
			enterPasswordAuthentificationView.showViewGer(authentificationService);
		}else if(person.getLanguageType() == LanguageType.ENGLISH) {
			enterPasswordAuthentificationView.showViewEng(authentificationService);
		}
		return authentificationService;
	}

}
