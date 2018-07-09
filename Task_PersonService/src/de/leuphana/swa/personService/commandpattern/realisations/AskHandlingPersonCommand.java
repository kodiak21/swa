package de.leuphana.swa.personService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;
import de.leuphana.swa.personService.commandpattern.PersonalCommand;
import de.leuphana.swa.personService.view.PersonalView;

public class AskHandlingPersonCommand implements PersonalCommand {

	private String name;
	private PersonalView personalView;

	public AskHandlingPersonCommand(final PersonalView pView, String name) {
		this.personalView = pView;
		this.name = name;
	}
	
	@Override
	public Person createPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person deletePerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int askHandlingPerson() throws IOException {
		int i = personalView.askDeletePerson(name);
		return i;
	}

	@Override
	public void confirmDeletePerson() {
		
	}

	@Override
	public String askName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonType askPersonType() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void confirmCreatePerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printInfoPerson() {
		// TODO Auto-generated method stub
		
	}

}
