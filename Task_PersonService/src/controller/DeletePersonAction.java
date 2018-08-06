package controller;

import model.LanguageType;
import model.Person;
import model.PersonService;
import views.QuestionDeletePersonView;

public class DeletePersonAction implements PersonServiceAction {

	@Override
	public PersonService action(PersonService personService) {
		
		QuestionDeletePersonView questionDeletePersonView = new QuestionDeletePersonView();
		int answer;
		Person person;
		LanguageType language;
		
		person = personService.getPerson();
		language = person.getLanguageType();
		
		if (language == LanguageType.GERMAN) {
			answer = questionDeletePersonView.showViewGer();
		} else {
			answer = questionDeletePersonView.showViewEng();
		}
		
		
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
