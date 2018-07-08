package de.leuphana.swa.authentificationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import de.leuphana.swa.authentificationService.commandpattern.AuthentificationCommand;
import de.leuphana.swa.authentificationService.view.AuthenficationView;
import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;

public class PrintAuthentificationChoiceCommand implements AuthentificationCommand {

	private AuthenficationView authentificationView;
	private PersonType personType;
	private String name;

	public PrintAuthentificationChoiceCommand(final AuthenficationView av, PersonType personType, String name) {
		this.authentificationView = av;
		this.personType = personType;
		this.name = name;
	}
	
	@Override
	public Person createPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int printAuthentificationChoice() throws IOException {
		int i = authentificationView.printAuthentificateChoice(personType, name);
		return i;
	}

	@Override
	public AuthenficationStrategy createStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAuthenficationStrategy() {
		// TODO Auto-generated method stub
		
	}

}
