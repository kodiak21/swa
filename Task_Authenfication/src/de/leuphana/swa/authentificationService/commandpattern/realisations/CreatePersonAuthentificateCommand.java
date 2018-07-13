package de.leuphana.swa.authentificationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import de.leuphana.swa.authentificationService.commandpattern.AuthentificationCommand;
import de.leuphana.swa.authentificationService.view.AuthenficationView;
import model.Person;
import model.PersonType;
import model.UserFactory;

public class CreatePersonAuthentificateCommand implements AuthentificationCommand {

	private UserFactory userFactory;
	private PersonType personType;
	private String name;
	
	public CreatePersonAuthentificateCommand(final UserFactory userFactory, PersonType personType, String name) {
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
	public int printAuthentificationChoice() throws IOException {
		return 0;
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
