package de.leuphana.swa.authentificationService.commandpattern;

import java.io.IOException;

import model.AuthentificationStrategy;
import model.Person;

public interface AuthentificationCommand {
	Person createPerson();

	int printAuthentificationChoice() throws IOException;
	
	AuthentificationStrategy createStrategy();
	
	void printAuthenficationStrategy();

}
