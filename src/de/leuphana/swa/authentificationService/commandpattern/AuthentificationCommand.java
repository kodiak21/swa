package de.leuphana.swa.authentificationService.commandpattern;

import java.io.IOException;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import model.Person;

public interface AuthentificationCommand {
	Person createPerson();

	int printAuthentificationChoice() throws IOException;
	
	AuthenficationStrategy createStrategy();
	
	void printAuthenficationStrategy();

}
