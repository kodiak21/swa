package controller;
import model.PersonService;

/**Übergeordneter Service: PersonService
 * <br> 
* PersonServiceController verwaltet alle Actions innerhalb PersonService
**/


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
