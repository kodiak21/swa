package controller;
import model.PersonService;

/**<b> Übergeordneter Service</b>: PersonService<br>
 * 
 * <br><b>PersonServiceController:</b> Controller, der alle PersonService bezogenen Actions verwaltet 
 * 
 * 
 *
 */

public class PersonServiceController {
	public PersonService personCommand() {
		
		PersonService personService = new PersonService();
		
		CreatePersonAction createPersonAction = new CreatePersonAction();
		personService = createPersonAction.action(personService);
		
		PrintPersonAction printPersonAction = new PrintPersonAction();
		personService = printPersonAction.action(personService);
		
		DeletePersonAction deletePersonAction = new DeletePersonAction();
		personService = deletePersonAction.action(personService);
		
		if(personService.getDeleteAnswer()==2) {
			FareWellPersonAction fareWellPersonAction = new FareWellPersonAction();
			personService = fareWellPersonAction.action(personService);
		}
		
		return personService;
	}
}
