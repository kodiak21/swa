package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controller.AuthentificationServiceController;
import model.AuthentificationService;
import model.AuthentificationStrategy;
import model.AuthentificationStrategyFactory;
import model.CredentialType;
import model.LanguageType;
import model.Person;
import model.PersonType;
import model.UserFactory;

public class AuthentificationServiceTest {

	private Person person;
	private CredentialType credentialType;
	private UserFactory userFactory;
	private AuthentificationService authentificationService;
	private AuthentificationStrategy authentificationStrategy;
	
	private AuthentificationServiceController authentificationServiceController;

	@BeforeEach
	void setUp() throws Exception {
		String name = "John Moeller";		
		PersonType personType = PersonType.NATURALPERSON;	
		LanguageType languageType = LanguageType.ENGLISH;
		
		
		userFactory = new UserFactory();	
		
		person = userFactory.createPerson(personType,name, languageType);
		credentialType = CredentialType.FINGERPRINT;
		authentificationService = new AuthentificationService();
		
		authentificationServiceController = new AuthentificationServiceController();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		userFactory = null;
		person = null;
		authentificationStrategy = null;
		
		authentificationServiceController = null;
		
	}

	@Test
	@DisplayName("createAuthentification: is created Authentification of Type FINGERPRINT")
	void createAuthentificationStrategy() {
		authentificationService.createAuthentification(CredentialType.FINGERPRINT, person, authentificationService);
		authentificationStrategy = AuthentificationStrategyFactory.getAuthenticationMethod(credentialType, person, authentificationService);
		assertEquals(CredentialType.FINGERPRINT,authentificationStrategy.getCredentialType());
	}
	
	@Test
	@DisplayName("deleteAuthentification: is AuthentificationStrategy null after delete operation")
	void deleteAuthentificationStrategy() {
		authentificationService.deleteAuthentification();
		assertEquals(null, authentificationService.getAuthentificationStrategy());
	}
	
	@Test
	@DisplayName("authentificateSubject(): is Person authentificated by AuthentificationStrategy")
	void authentificateSubject() {
		if(person.getLanguageType()==LanguageType.GERMAN) {
			assertEquals(true,authentificationService.authentificateSubject());
		}
	}
	
	@Test
	@DisplayName("authentificationCommand(): test of AuthentificationServiceController")
	void testController() {
		authentificationServiceController.authentificationCommand(person);
	}

}
