package controller;

import model.LanguageType;
import model.PersonService;
import view.FareWellPersonView;

public class FareWellPersonAction implements PersonServiceAction {

	private FareWellPersonView fareWellPersonView;
	
	public FareWellPersonAction() {
		this.fareWellPersonView = new FareWellPersonView();
	}
	
	@Override
	public PersonService action(PersonService personService) {
		if(personService.getPerson().getLanguageType()==LanguageType.GERMAN) {
			personService.deletePerson();
			fareWellPersonView.showViewGer();
			System.exit(0);
		}else if(personService.getPerson().getLanguageType()==LanguageType.ENGLISH) {
			personService.deletePerson();
			fareWellPersonView.showViewEng();
			System.exit(0);
		}
		return personService;
	}

}
