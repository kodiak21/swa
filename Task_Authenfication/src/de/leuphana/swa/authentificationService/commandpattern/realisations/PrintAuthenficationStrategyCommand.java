package de.leuphana.swa.authentificationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.authentificationService.commandpattern.AuthentificationCommand;
import de.leuphana.swa.authentificationService.view.AuthenficationView;
import model.AuthentificationStrategy;
import model.Person;

public class PrintAuthenficationStrategyCommand implements AuthentificationCommand {

	private AuthentificationStrategy authMethod;
	private AuthenficationView authView;

	public PrintAuthenficationStrategyCommand(final AuthenficationView av, AuthentificationStrategy method) {
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
	public AuthentificationStrategy createStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAuthenficationStrategy() {
		authView.printAuthentificationStrategy(authMethod);	
	}

}
