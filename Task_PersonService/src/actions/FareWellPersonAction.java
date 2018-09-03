package actions;

import model.LanguageType;
import model.PersonService;
import view.FareWellPersonView;

/**<b> Übergeordneter Service</b>: PersonService<br>
 * <b> verbundene Views</b>: FareWellPersonView<br>
 * <br><b>FareWellPersonAction:</b> Der Kunde wird verabschiedet bei Abbruch des PersonService
 * 
 * 
 *
 */

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
