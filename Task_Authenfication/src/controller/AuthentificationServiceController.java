package controller;

import model.AuthentificationService;
import model.CredentialType;
import model.LanguageType;
import model.Person;
import model.PersonType;
import model.UserFactory;

public class AuthentificationServiceController {

	public AuthentificationService authentificationCommand(Person person) {

		AuthentificationService authentificationService = new AuthentificationService();
		AuthentificationServiceAction action;

		CredentialType credentialType = CredentialType.USERNAME;
		
//		String name = "John Moeller";
//		PersonType personType = PersonType.LEGALPERSON;
//		UserFactory userfactory = new UserFactory();
//		LanguageType languageType = LanguageType.GERMAN;
//		Person person = userfactory.createPerson(personType, name, languageType);
		
		action = new CreateAuthentificationAction(person);
		authentificationService = action.action(authentificationService);
		
		action = new PrintAuthentificationAction(credentialType, person);
		authentificationService = action.action(authentificationService);
		
		action = new DeleteAuthentificationAction(person);
		authentificationService = action.action(authentificationService);
		
		


		return authentificationService;
	}
}


