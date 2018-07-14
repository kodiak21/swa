package de.leuphana.swa.authentificationService.commandpattern;

import java.io.IOException;

import de.leuphana.swa.authentificationService.commandpattern.realisations.CreateAuthenficationStrategyCommand;
import de.leuphana.swa.authentificationService.commandpattern.realisations.CreatePersonAuthentificateCommand;
import de.leuphana.swa.authentificationService.commandpattern.realisations.PrintAuthenficationStrategyCommand;
import de.leuphana.swa.authentificationService.commandpattern.realisations.PrintAuthentificationChoiceCommand;
import de.leuphana.swa.authentificationService.view.AuthenficationView;
import model.AuthentificationStrategy;
import model.AuthentificationStrategyFactory;
import model.CredentialType;
import model.Person;
import model.PersonType;
import model.UserFactory;

public class AuthentificationCommandController {
	public static void main(final String[] args) throws IllegalArgumentException, IOException {

		String name = "John Moeller";
		PersonType personType = PersonType.NATURALPERSON;
		final UserFactory userfactory = new UserFactory();
		final AuthentificationStrategyFactory strategyFactory = new AuthentificationStrategyFactory();

		final CreateAuthentification ca = new CreateAuthentification();
		
		final AuthenficationView av = new AuthenficationView();

		final CreatePersonAuthentificateCommand createPerson = new CreatePersonAuthentificateCommand(userfactory,
				personType, name);

		final PrintAuthentificationChoiceCommand printChoice = new PrintAuthentificationChoiceCommand(av, personType,
				name);

		Person p = ca.createPerson(createPerson);

		int i = ca.printChoice(printChoice);

		switch (i) {
		case 1:
			CredentialType credentialType = CredentialType.USERNAME;
			CreateAuthenficationStrategyCommand createStrategy = new CreateAuthenficationStrategyCommand(
					strategyFactory, credentialType, p);
			AuthentificationStrategy method = ca.returnStrategy(createStrategy);
			PrintAuthenficationStrategyCommand printStrategy = new PrintAuthenficationStrategyCommand(av, method);
			ca.printStrategy(printStrategy);
			break;
		case 2:
			credentialType = CredentialType.EYESCAN;
			createStrategy = new CreateAuthenficationStrategyCommand(strategyFactory, credentialType, p);
			method = ca.returnStrategy(createStrategy);
			printStrategy = new PrintAuthenficationStrategyCommand(av, method);
			ca.printStrategy(printStrategy);
			break;
		case 3:
			credentialType = CredentialType.FINGERPRINT;
			createStrategy = new CreateAuthenficationStrategyCommand(strategyFactory, credentialType, p);
			method = ca.returnStrategy(createStrategy);
			printStrategy = new PrintAuthenficationStrategyCommand(av, method);
			ca.printStrategy(printStrategy);
			break;
		default:
			break;
		}

	}
}
