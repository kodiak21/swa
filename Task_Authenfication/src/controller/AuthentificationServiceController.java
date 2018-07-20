package controller;

import model.AuthentificationService;
import model.Person;

public class AuthentificationServiceController {

	

	public AuthentificationService authentificationCommand(Person person) {

		AuthentificationService authentificationService = new AuthentificationService();
		AuthentificationServiceAction action;
		
		action = new CreateAuthentificationAction(person);
		authentificationService = action.action(authentificationService);
		
		
		action = new DeleteAuthentificationAction(person);
		authentificationService = action.action(authentificationService);
		
		action = new PrintAuthentificationAction(person, authentificationService.getAuthentificationStrategy());
		authentificationService = action.action(authentificationService);
		


		return authentificationService;
	}
}


