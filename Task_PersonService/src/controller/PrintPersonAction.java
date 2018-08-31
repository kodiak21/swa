package controller;

import model.LanguageType;

import model.Person;
import model.PersonService;
import view.PrintPersonView;

/**Übergeordneter Service: PersonService
 * <br> 
* PrintPersonAction gibt die gegebenen Informationen aus
**/

public class PrintPersonAction implements PersonServiceAction {

	@Override
	public PersonService action(PersonService personService) {
		Person person = personService.getPerson();
		PrintPersonView printPersonView = new PrintPersonView();
		LanguageType languageType = person.getLanguageType();
		
		if (languageType == LanguageType.GERMAN) {
			printPersonView.showViewGer(person);
		} else {
			printPersonView.showViewEng(person);
		}
		
		return personService;
	}

}
