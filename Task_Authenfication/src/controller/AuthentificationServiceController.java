package controller;

import model.AuthentificationService;
import model.Person;

/**<b> Übergeordneter Service</b>: AuthentificationService<br>
 * 
 * <br><b>AuthentificationServiceController:</b> Controller, der alle AuthentificationService bezogenen Aktionen verwaltet<br> 
 * 
 * <br><b>verwaltete Aktionen:</b> Funktionen werden in den einzelnen Klassen erläutert<br>
 *
 *
 * <br> - CreateAuthentificationAction
 * <br> - ConfirmAuthentificationAction
 * <br> - DeleteAuthentificationAction
 * <br> - AskPasswordAuthentificationAction
 * <br> - SetPasswordAuthentificationAction
 * <br> - EnterPasswordAuthentificationAction
 * <br> - PrintAuthentificationAction
 * <br> - FareWellAuthentificationAction
 * 
 *
 */

public class AuthentificationServiceController {

	private String normalword = "1234";
	private int failedTries = 5;

	public AuthentificationService authentificationCommand(Person person) {

		AuthentificationService authentificationService = new AuthentificationService();
		AuthentificationServiceAction action;

		action = new CreateAuthentificationAction(person);
		authentificationService = action.action(authentificationService);

		authentificationService.setPassword(normalword);
		authentificationService.setFailedTries(failedTries);

		if (authentificationService.getCreateAnswer() == 2) {
			action = new ConfirmAuthentificationAction(person);
			authentificationService = action.action(authentificationService);

			action = new DeleteAuthentificationAction(person);
			authentificationService = action.action(authentificationService);

			action = new AskPasswordAuthentificationAction(person);
			authentificationService = action.action(authentificationService);

			if (authentificationService.getPasswordAnswer() == 1) {
				action = new SetPasswordAuthentificationAction(person);
				authentificationService = action.action(authentificationService);
			}
			
			action = new EnterPasswordAuthentificationAction(person);
			authentificationService = action.action(authentificationService);
			
			action = new PrintAuthentificationAction(person, authentificationService.getAuthentificationStrategy());
			authentificationService = action.action(authentificationService);

		}

		if (authentificationService.getCreateAnswer() == 1 || authentificationService.getCreateAnswer() == 3) {
			action = new ConfirmAuthentificationAction(person);
			authentificationService = action.action(authentificationService);

			action = new DeleteAuthentificationAction(person);
			authentificationService = action.action(authentificationService);

			if (authentificationService.getDeleteAnswer() == 2) {
				action = new FareWellAuthentificationAction(person);
				authentificationService = action.action(authentificationService);
			}

			action = new PrintAuthentificationAction(person, authentificationService.getAuthentificationStrategy());
			authentificationService = action.action(authentificationService);
		}

		return authentificationService;
	}
}
