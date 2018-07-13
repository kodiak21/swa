package de.leuphana.swa.personService.commandpattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;

public class PersonOrganisation {
	private List<PersonalCommand> history = new ArrayList<PersonalCommand>();
	
	public String askName(final PersonalCommand cmd) throws IOException {
		this.history.add(cmd); // optional
		String name = cmd.askName();
		return name;
	}
	
	public Person createPerson(final PersonalCommand cmd) {
		this.history.add(cmd); // optional
		Person p = cmd.createPerson();
		return p;
	}
	
	public Person deletePerson(final PersonalCommand cmd) {
		this.history.add(cmd); // optional
		Person p = cmd.deletePerson();
		return p;
	}
	
	public int askDeletePerson(final PersonalCommand cmd) throws IOException {
		this.history.add(cmd); // optional
		int i = cmd.askHandlingPerson();
		return i;
	}
	
	public void confirmCreatePerson(final PersonalCommand cmd) {
		this.history.add(cmd); // optional
		cmd.confirmCreatePerson();
	}
	
	public void confirmDeletePerson(final PersonalCommand cmd) {
		this.history.add(cmd); // optional
		cmd.confirmDeletePerson();
	}
	
	public void printInfoPerson(final PersonalCommand cmd) {
		this.history.add(cmd); // optional
		cmd.printInfoPerson();
	}
	
	public PersonType askPersonType(final PersonalCommand cmd) throws IOException {
		this.history.add(cmd); // optional
		PersonType personType = cmd.askPersonType();
		return personType;
	}
}
