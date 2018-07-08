package de.leuphana.swa.authentificationService.commandpattern;

import java.io.IOException;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import de.leuphana.swa.personService.Person;

public interface AuthentificationCommand {
	Person createPerson();

	int printAuthentificationChoice() throws IOException;
	
	AuthenficationStrategy createStrategy();
	
	void printAuthenficationStrategy();

}
