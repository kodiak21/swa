package controller;
import model.PersonService;

public class PersonServiceController {
	public PersonService personCommand() {
		
		PersonService personService = new PersonService();
		
		CreatePersonAction createPersonAction = new CreatePersonAction();
		personService = createPersonAction.action(personService);
		
		PrintPersonAction printPersonAction = new PrintPersonAction();
		personService = printPersonAction.action(personService);
		
		DeletePersonAction deletePersonAction = new DeletePersonAction();
		personService = deletePersonAction.action(personService);
		
		return personService;
	}
}
