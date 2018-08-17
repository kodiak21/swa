package controller;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.ChangePasswordView;

public class ChangePasswordAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	private ChangePasswordView changePasswordView;
	
	public ChangePasswordAuthentificationAction(Person person) {
		this.person = person;
		this.changePasswordView = new ChangePasswordView();
	}
	
	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		if(person.getLanguageType() == LanguageType.GERMAN) {
			if(authentificationService.getPasswordAnswer()==1) {
				authentificationService.setPassword(changePasswordView.showViewGer());
			}else if(authentificationService.getPasswordAnswer()==2) {
				authentificationService.setPassword("1234");
			}
			
		}else if(person.getLanguageType()==LanguageType.ENGLISH) {
			authentificationService.setPassword(changePasswordView.showViewEng());;
		}
		return authentificationService;
	}

}
