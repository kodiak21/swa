package controller;

import model.PersonService;
import model.PersonType;
import views.QuestionNameView;
import views.QuestionPersonTypeView;

public class CreatePersonAction implements PersonServiceAction{

	@Override
	public PersonService action(PersonService personService) {
		
		QuestionPersonTypeView questionPersonTypeView = new QuestionPersonTypeView();
		QuestionNameView questionNameView = new QuestionNameView();
		
		PersonType personType;
		String name;
		
		if(questionPersonTypeView.showView() ==1) {
			personType = PersonType.NATURALPERSON;
		}else {
			personType = PersonType.LEGALPERSON;
		}
		name = questionNameView.showView();
		
		personService.createPerson(personType, name);
		return personService;
	}

}
