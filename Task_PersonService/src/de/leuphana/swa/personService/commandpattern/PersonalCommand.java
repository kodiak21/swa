package de.leuphana.swa.personService.commandpattern;

import java.io.IOException;

import model.Person;
import model.PersonType;

public interface PersonalCommand {
	
	String askName() throws IOException;
	
	Person createPerson();
	Person deletePerson();
	
	int askHandlingPerson() throws IOException;
	PersonType askPersonType() throws IOException;
	
	void confirmCreatePerson();
	void confirmDeletePerson();
	
	void printInfoPerson();
}
