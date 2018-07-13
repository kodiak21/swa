package de.leuphana.swa.authentificationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import de.leuphana.swa.authentificationService.AuthentificationStrategyFactory;
import de.leuphana.swa.authentificationService.CredentialType;
import de.leuphana.swa.authentificationService.commandpattern.AuthentificationCommand;
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
	public AuthenficationStrategy createStrategy() {
		AuthenficationStrategy authMethod = authFactory.getAuthenticationMethod(credType, person);
		return authMethod;
	}

	@Override
	public void printAuthenficationStrategy() {
		// TODO Auto-generated method stub
		
	}
	

}
