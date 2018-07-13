package de.leuphana.swa.personService.commandpattern;

import java.io.IOException;

import de.leuphana.swa.personService.commandpattern.realisations.AskHandlingPersonCommand;
import de.leuphana.swa.personService.commandpattern.realisations.AskNameCommand;
import de.leuphana.swa.personService.commandpattern.realisations.AskPersonTypeCommand;
import de.leuphana.swa.personService.commandpattern.realisations.ConfirmCreatePersonCommand;
import de.leuphana.swa.personService.commandpattern.realisations.ConfirmDeletePersonCommand;
import de.leuphana.swa.personService.commandpattern.realisations.CreatePersonCommand;
import de.leuphana.swa.personService.commandpattern.realisations.DeletePersonCommand;
import de.leuphana.swa.personService.commandpattern.realisations.PrintPersonInformationCommand;
import de.leuphana.swa.personService.view.PersonalView;
import de.leuphana.swa.organisationService.commandpattern.realisations.PrintUserInformationCommand;
import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;
import de.leuphana.swa.personService.UserFactory;

public class PersonalCommandController {
	public static void main(final String[] args) throws IllegalArgumentException, IOException {
	
		//String name = "John Moeller";
		//PersonType personType = PersonType.LEGALPERSON;
		
		final UserFactory userFactory = new UserFactory();
		
		final PersonOrganisation pOrg = new PersonOrganisation();
		
		final PersonalView pView = new PersonalView();
		
		final AskNameCommand askName = new AskNameCommand(pView);
		
		final AskPersonTypeCommand askType = new AskPersonTypeCommand(pView);
		
		
		
		String name = pOrg.askName(askName);
		
		PersonType personType = pOrg.askPersonType(askType);
		
		final AskHandlingPersonCommand askHandling = new AskHandlingPersonCommand(pView, name);
		
		int i = pOrg.askDeletePerson(askHandling);
		
		CreatePersonCommand createPerson = new CreatePersonCommand(userFactory, personType, name);
		DeletePersonCommand deletePerson = new DeletePersonCommand();
		
		final ConfirmCreatePersonCommand confirmCreate = new ConfirmCreatePersonCommand(pView, name);
		
		final ConfirmDeletePersonCommand confirmDelete = new ConfirmDeletePersonCommand(pView, name);
		
		
		Person p = null;
		
		switch(i) {
		case 1:
			pOrg.createPerson(createPerson);
			pOrg.confirmCreatePerson(confirmCreate);
			break;
		case 2:
			p = pOrg.deletePerson(deletePerson);
			pOrg.confirmDeletePerson(confirmDelete);
			break;
		case 3:
			p = pOrg.createPerson(createPerson);
			pOrg.confirmCreatePerson(confirmCreate);
			PrintPersonInformationCommand printInfo = new PrintPersonInformationCommand(pView, p);
			pOrg.printInfoPerson(printInfo);
		}
	
		
	
	
	}
}
