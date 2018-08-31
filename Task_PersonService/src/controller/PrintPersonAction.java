package controller;

import model.LanguageType;

import model.Person;
import model.PersonService;
import view.PrintPersonView;

/**<b> Übergeordneter Service</b>: PersonService<br>
 * <b> verbundene Views</b>: PrintPersonView<br>
 * <br>
 * <b>PrintPersonAction:</b> Ausgabe der ermittelten Werte
 * 
 *
 */


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
