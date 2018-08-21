package test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controller.PersonServiceController;
import model.LanguageType;
import model.Person;
import model.PersonService;
import model.PersonType;
import model.UserFactory;

class PersonServiceTest {

	private LanguageType languageType;
	private PersonType personType;
	private String name;

	private Person person;

	private PersonService personService;
	private UserFactory userFactory;
	
	private PersonServiceController personServiceController;

	@BeforeEach
	void setUp() throws Exception {
		languageType = LanguageType.GERMAN;
		personType = PersonType.LEGALPERSON;
		name = "John Miller";

		personService = new PersonService();
		userFactory = new UserFactory();
		person = userFactory.createPerson(personType, name, languageType);
		personService.setPerson(person);
		
		personServiceController = new PersonServiceController();
	}

	@AfterEach
	void tearDown() throws Exception {
		personService = null;
		userFactory = null;
		personServiceController = null;
	}

	@Test
	@DisplayName("createPerson(): is PersonType LEGALPERSON")
	void createTest1() {

		assertEquals(PersonType.LEGALPERSON, personService.getPerson().getPersonType());
	}

	@Test
	@DisplayName("createPerson(): is LanguageType GERMAN")
	void createTest2() {

		assertEquals(LanguageType.GERMAN,personService.getPerson().getLanguageType());
	}

	@Test
	@DisplayName("createPerson(): is Name of Person John Miller")
	void createTest3() {

		assertEquals("John Miller",personService.getPerson().getName());
	}

	@Test
	@DisplayName("deletePerson(): is PersonObject null after delete operation")
	void deleteTest() {
		personService.deletePerson();
		assertEquals(null,personService.getPerson());
	}
	
	@Test
	@DisplayName("printPerson(): if Person is legal, then company")
	void printPerson() {
		person = personService.getPerson();
		if(person.getPersonType()==PersonType.LEGALPERSON)
		assertEquals("Sie vertreten ein Unternehmen. Dessen Name ist " + personService.printPerson().getName(),
				"Sie vertreten ein Unternehmen. Dessen Name ist " + person.getName());

	}
	
	@Test
	@DisplayName("personCommand(): test of PersonServiceController")
	void testController() {
		personServiceController.personCommand();
	}
}
