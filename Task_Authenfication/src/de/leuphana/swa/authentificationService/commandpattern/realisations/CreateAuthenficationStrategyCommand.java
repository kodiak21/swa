package de.leuphana.swa.authentificationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.authentificationService.commandpattern.AuthentificationCommand;
import model.AuthentificationStrategy;
import model.AuthentificationStrategyFactory;
import model.CredentialType;
import model.Person;
import model.PersonType;
import model.UserFactory;

public class CreateAuthenficationStrategyCommand implements AuthentificationCommand{

	private AuthentificationStrategyFactory authFactory;
	private CredentialType credType;
	private Person person;

	public CreateAuthenficationStrategyCommand(final AuthentificationStrategyFactory authFactory, CredentialType credentialType, Person person) {
		this.authFactory = authFactory;
		this.credType = credentialType;
		this.person = person;
	}
	
	@Override
	public Person createPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int printAuthentificationChoice() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AuthentificationStrategy createStrategy() {
		AuthentificationStrategy authMethod = authFactory.getAuthenticationMethod(credType, person);
		return authMethod;
	}

	@Override
	public void printAuthenficationStrategy() {
		// TODO Auto-generated method stub
		
	}
	

}
