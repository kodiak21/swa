package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.AuthentificationStrategy;
import model.CredentialType;
import model.LanguageType;
import model.Person;
import model.PersonType;
import model.UserFactory;
import model.UserNameStrategy;

public class AuthentificationServiceTest {

	private Person person;
	private AuthentificationStrategy authentificationStrategy;

	@BeforeEach
	void setUp() throws Exception {
		String name = "John Moeller";		
		PersonType personType = PersonType.LEGALPERSON;	
		UserFactory userfactory = new UserFactory();
		LanguageType languageType = LanguageType.ENGLISH;
		person = userfactory.createPerson(personType,name, languageType);
		authentificationStrategy = new UserNameStrategy("1234");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("person.getName(): is person Name John Moeller")
	void testPerson1() {	
		assertEquals("John Moeller", person.getName());
	}
	
	@Test
	@DisplayName("person.getPersonType(): is person a legal person")
	void testPerson2() {	
		assertEquals(PersonType.LEGALPERSON, person.getPersonType());
	}
	
	@Test
	@DisplayName("person.getLanguage(): is language english")
	void testPerson3() {	
		assertEquals(LanguageType.ENGLISH, person.getLanguageType());
	}
	
	@Test
	@DisplayName("authentificationStrategy.getCredentialType(): is identification by USERNAME")
	void testAuthentificationStrategy1() {	
		assertEquals(CredentialType.USERNAME, authentificationStrategy.getCredentialType());
	}


}
