package controller;

import model.LanguageType;
import model.Person;
import model.PersonService;
import views.PrintPersonView;

public class PrintPersonAction implements PersonServiceAction {

	@Override
	public PersonService action(PersonService personService) {
		Person person;
		PrintPersonView printPersonView;
		LanguageType language;
		
		person = personService.getPerson();
		printPersonView = new PrintPersonView();
		language = person.getLanguage();
		
		if (language == LanguageType.GERMAN) {
			printPersonView.showViewGer(person);
		} else {
			printPersonView.showViewEng(person);
		}
		
		return personService;
	}

}
