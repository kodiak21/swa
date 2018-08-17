package controller;

import model.AuthentificationService;
import model.Person;

public class AuthentificationServiceController {

	private String normalword ="1234";

	public AuthentificationService authentificationCommand(Person person) {

		AuthentificationService authentificationService = new AuthentificationService();
		AuthentificationServiceAction action;
		
		action = new CreateAuthentificationAction(person);
		authentificationService = action.action(authentificationService);
		
		authentificationService.setPassword(normalword);
		
		if(authentificationService.getCreateAnswer()==2) {
			action = new AskPasswordAuthentificationAction(person);
			authentificationService = action.action(authentificationService);
			if(authentificationService.getPasswordAnswer()==1) {
				action = new SetPasswordAuthentificationAction(person);
				authentificationService = action.action(authentificationService);
			}
		}
		action = new ConfirmAuthentificationAction(person);
		authentificationService = action.action(authentificationService);
		
		action = new DeleteAuthentificationAction(person);
		authentificationService = action.action(authentificationService);
		
		if(authentificationService.getDeleteAnswer()==2) {
			action = new FareWellAuthentificationAction(person);
			authentificationService = action.action(authentificationService);
		}
		
		action = new PrintAuthentificationAction(person, authentificationService.getAuthentificationStrategy());
		authentificationService = action.action(authentificationService);
		


		return authentificationService;
	}
}


