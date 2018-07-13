package de.leuphana.swa.personService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.personService.commandpattern.PersonalCommand;
import de.leuphana.swa.personService.view.PersonalView;
import model.Person;
import model.PersonType;

public class AskNameCommand implements PersonalCommand {

	private PersonalView personalView;

	public AskNameCommand(final PersonalView pView) {
		this.personalView = pView;
	}
	
	@Override
	public String askName() throws IOException {
		String name = personalView.askName();
		return name;
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
	public void confirmDeletePerson() {
		// TODO Auto-generated method stub

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
