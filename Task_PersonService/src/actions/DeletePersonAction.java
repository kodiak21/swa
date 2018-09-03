package actions;

import controller.PersonServiceController;
import model.LanguageType;
import model.Person;
import model.PersonService;
import view.QuestionDeletePersonView;

/**<b> Übergeordneter Service</b>: PersonService<br>
 * <b> verbundene Views</b>: QuestionDeletePersonView<br>
 * <br><b>DeletePersonAction:</b> Ein Personenobjekt wird auf Anfrage gelöscht
 * 
 * @param answer - Kundenauswahl 
 * 
 *
 */


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
			personService.setDeleteAnswer(questionDeletePersonView.showViewGer());
		} else {
			personService.setDeleteAnswer(questionDeletePersonView.showViewEng());
		}

		answer = personService.getDeleteAnswer();

		switch (answer) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			PersonServiceController personServiceController = new PersonServiceController();
			personService.setPerson(personServiceController.personCommand().getPerson());
			break;
		default:
			break;
		}

		return personService;
	}
}
