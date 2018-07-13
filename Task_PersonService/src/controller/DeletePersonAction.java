package controller;

import model.PersonService;
import views.QuestionDeletePersonView;

public class DeletePersonAction implements PersonServiceAction {

	@Override
	public PersonService action(PersonService personService) {
		
		QuestionDeletePersonView questionDeletePersonView = new QuestionDeletePersonView();
		int answer;
		
		answer = questionDeletePersonView.showViewGer();
		switch (answer) {
		case 1:	
			break;
		case 2:	
			personService.deletePerson();
			break;
		case 3:	
			PersonServiceController personServiceController = new PersonServiceController();
			personService.setPerson(personServiceController.personCommand().getPerson());
			break;
		default: break;
		}
		
	
		return personService;
	}
}
