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
import model.Person;
import model.PersonType;
import model.UserFactory;
import de.leuphana.swa.organisationService.commandpattern.realisations.PrintUserInformationCommand;

public class PersonalCommandController {
	public static void main(final String[] args) throws IllegalArgumentException, IOException {
	
		//String name = "John Moeller";
		//PersonType personType = PersonType.LEGALPERSON;
		
		final UserFactory userFactory = new UserFactory();
		
		final PersonOrganisation personOrganisation = new PersonOrganisation();
		
		final PersonalView personalView = new PersonalView();
		
		final AskNameCommand askName = new AskNameCommand(personalView);
		
		final AskPersonTypeCommand askType = new AskPersonTypeCommand(personalView);
		
		
		
		String name = personOrganisation.askName(askName);
		
		PersonType personType = personOrganisation.askPersonType(askType);
		
		final AskHandlingPersonCommand askHandling = new AskHandlingPersonCommand(personalView, name);
		
		int i = personOrganisation.askDeletePerson(askHandling);
		
		CreatePersonCommand createPerson = new CreatePersonCommand(userFactory, personType, name);
		DeletePersonCommand deletePerson = new DeletePersonCommand();
		
		final ConfirmCreatePersonCommand confirmCreate = new ConfirmCreatePersonCommand(personalView, name);
		
		final ConfirmDeletePersonCommand confirmDelete = new ConfirmDeletePersonCommand(personalView, name);
		
		
		Person p = null;
		
		switch(i) {
		case 1:
			personOrganisation.createPerson(createPerson);
			personOrganisation.confirmCreatePerson(confirmCreate);
			break;
		case 2:
			p = personOrganisation.deletePerson(deletePerson);
			personOrganisation.confirmDeletePerson(confirmDelete);
			break;
		case 3:
			p = personOrganisation.createPerson(createPerson);
			personOrganisation.confirmCreatePerson(confirmCreate);
			PrintPersonInformationCommand printInfo = new PrintPersonInformationCommand(personalView, p);
			personOrganisation.printInfoPerson(printInfo);
		}
	
		
	
	
	}
}
