package de.leuphana.swa.personService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.personService.commandpattern.PersonalCommand;
import de.leuphana.swa.personService.view.PersonalView;
import model.Person;
import model.PersonType;

public class ConfirmCreatePersonCommand implements PersonalCommand {

	private String name;
	private PersonalView personalView;

	public ConfirmCreatePersonCommand(final PersonalView pView, String name) {
		this.personalView = pView;
		this.name = name;
	}
	
	@Override
	public String askName() throws IOException {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PersonType askPersonType() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void confirmDeletePerson() {
		// TODO Auto-generated method stub

	}

	@Override
	public void confirmCreatePerson() {
		personalView.confirmCreatePerson(name);
		
	}

	@Override
	public void printInfoPerson() {
		// TODO Auto-generated method stub
		
	}

}
