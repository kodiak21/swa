package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.CreateAuthentificationAction;
import controller.DeleteAuthentificationAction;
import controller.PrintAuthentificationAction;
import model.AuthentificationService;
import model.CredentialType;
import model.Person;
import model.PersonType;
import model.UserFactory;

class AuthentificationServiceTest {



	private CredentialType credentialType;
	private Person person;
	private CreateAuthentificationAction action;

	@BeforeEach
	void setUp() throws Exception {
		credentialType = CredentialType.USERNAME;
		String name = "John Moeller";		
		PersonType personType = PersonType.LEGALPERSON;	
		UserFactory userfactory = new UserFactory();
		person = userfactory.createPerson(personType,name);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		AuthentificationService authentificationService = new AuthentificationService();
		action = new CreateAuthentificationAction(person);
		authentificationService = action.action(authentificationService);
		PrintAuthentificationAction action = new PrintAuthentificationAction(credentialType);
		authentificationService = action.action(authentificationService);
		DeleteAuthentificationAction action2 = new DeleteAuthentificationAction(person);
		authentificationService = action2.action(authentificationService);
		
	}

}
