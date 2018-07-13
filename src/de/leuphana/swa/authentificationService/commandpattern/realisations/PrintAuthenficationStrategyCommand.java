package de.leuphana.swa.authentificationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import de.leuphana.swa.authentificationService.commandpattern.AuthentificationCommand;
import de.leuphana.swa.authentificationService.view.AuthenficationView;
import model.Person;

public class PrintAuthenficationStrategyCommand implements AuthentificationCommand {

	private AuthenficationStrategy authMethod;
	private AuthenficationView authView;

	public PrintAuthenficationStrategyCommand(final AuthenficationView av, AuthenficationStrategy method) {
		this.authView = av;
		this.authMethod = method;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAuthenficationStrategy() {
		authView.printAuthentificationStrategy(authMethod);	
	}

}
