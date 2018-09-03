package actions;

import model.LanguageType;

import model.PersonService;
import model.PersonType;
import view.QuestionLanguageView;
import view.QuestionNameView;
import view.QuestionPersonTypeView;

/**<b> Übergeordneter Service</b>: PersonService<br>
 * <b> verbundene Views</b>: QuestionLanguageView, QuestionPersonView, QuestionNameView<br>
 * <br>
 * <b>CreatePersonAction:</b> Ein Personenobjekt wird erzeugt
 * 
 * @param language - Sprachauswahl
 * @param personType - PersonenTyp
 * @param name - Personenname
 * 
 *
 */

public class CreatePersonAction implements PersonServiceAction{

	@Override
	public PersonService action(PersonService personService) {
		
		QuestionPersonTypeView questionPersonTypeView = new QuestionPersonTypeView();
		QuestionNameView questionNameView = new QuestionNameView();
		
		PersonType personType;
		String name;
		LanguageType language;
		int answer;
		
		//Sprache wird erfragt
		QuestionLanguageView questionLanguageView = new QuestionLanguageView();
		if (questionLanguageView.showView()==1) {
			language = LanguageType.GERMAN;
		} else {
			language = LanguageType.ENGLISH;
		}
		
		//Personenart wird erfragt
		if (language == LanguageType.GERMAN) {
			answer = questionPersonTypeView.showViewGer();
		} else {
			answer = questionPersonTypeView.showViewEng();
		}
		if(answer ==1) {
			personType = PersonType.NATURALPERSON;
		}else {
			personType = PersonType.LEGALPERSON;
		}
		
		//Name wird erfragt
		if (language == LanguageType.GERMAN) {
			name = questionNameView.showViewGer();
		} else {
			name = questionNameView.showViewEng();
		}
		
		personService.createPerson(personType, name, language);
		return personService;
	}

}
