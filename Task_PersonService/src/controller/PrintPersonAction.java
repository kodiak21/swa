package controller;

import model.Person;
import model.PersonService;
import views.PrintPersonView;

public class PrintPersonAction implements PersonServiceAction {

	@Override
	public PersonService action(PersonService personService) {
		Person person;
		person = personService.getPerson();
		
		PrintPersonView printPersonView = new PrintPersonView();
		printPersonView.showView(person);
		return personService;
	}

}
