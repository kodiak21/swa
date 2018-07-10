package de.leuphana.swa.personService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;
import de.leuphana.swa.personService.commandpattern.PersonalCommand;

public class DeletePersonCommand implements PersonalCommand {

	@Override
	public Person createPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person deletePerson() {
		Person p = null;
		return p;
	}

	@Override
	public int askHandlingPerson() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void confirmDeletePerson() {
		// TODO Auto-generated method stub
		
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
