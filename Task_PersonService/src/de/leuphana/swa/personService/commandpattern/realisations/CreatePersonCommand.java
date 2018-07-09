package de.leuphana.swa.personService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;
import de.leuphana.swa.personService.UserFactory;
import de.leuphana.swa.personService.commandpattern.PersonalCommand;

public class CreatePersonCommand implements PersonalCommand {

	private UserFactory userFactory;
	private PersonType personType;
	private String name;
	
	public CreatePersonCommand(final UserFactory userFactory, PersonType personType, String name) {
		this.userFactory = userFactory;
		this.personType = personType;
		this.name = name;
	}
	

	@Override
	public Person createPerson(){
		Person p = userFactory.createPerson(personType, name);
		return p;
	}


	@Override
	public Person deletePerson() {
		// TODO Auto-generated method stub
		return null;
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
