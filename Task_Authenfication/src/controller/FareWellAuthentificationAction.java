package controller;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.FareWellAuthentificationView;

public class FareWellAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	private FareWellAuthentificationView fareWellAuthentificationView;
	
	public FareWellAuthentificationAction(Person person) {
		this.person = person;
		this.fareWellAuthentificationView = new FareWellAuthentificationView();
	}
	
	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		
		if(person.getLanguageType()== LanguageType.GERMAN) {
			fareWellAuthentificationView.showViewGer();
			System.exit(0);
		}else if(person.getLanguageType()==LanguageType.ENGLISH) {
			fareWellAuthentificationView.showViewEng();
			System.exit(0);
		}
		
		
		return authentificationService;
	}

}
