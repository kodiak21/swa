package de.leuphana.swa.authentificationService.commandpattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import de.leuphana.swa.organisationService.commandpattern.realisations.CreatePersonCommand;
import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;

public class CreateAuthentification {
	private List<AuthentificationCommand> history = new ArrayList<AuthentificationCommand>();

	public Person createPerson(final AuthentificationCommand cmd) {
		this.history.add(cmd); // optional
		Person p = cmd.createPerson();
		return p;
	}
	
	public int printChoice(final AuthentificationCommand cmd) throws IOException {
		this.history.add(cmd); // optional
		int i = cmd.printAuthentificationChoice();
		return i;
	}
	
	public AuthenficationStrategy returnStrategy(final AuthentificationCommand cmd) {
		this.history.add(cmd); // optional
		AuthenficationStrategy method = cmd.createStrategy();
		return method;	
	}
	
	public void printStrategy(final AuthentificationCommand cmd) {
		this.history.add(cmd); // optional
		cmd.printAuthenficationStrategy();
	}
	
	
}
