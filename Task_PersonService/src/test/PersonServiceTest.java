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
import view.QuestionDeletePersonView;

/**<b> Übergeordneter Service</b>: PersonService<br>
 * 
 * <br>
 * <b>PersonServiceTest:</b> Testet alle wichtigen Funktionen von PersonService<br>
 * 
 *<br><b> getestete Methoden:</b><br>
 *
 *<br>- createPerson() - erzeugt PersonObject<br>
 *- deletePerson() - löscht PersonObject <br>
 *- printPerson() - gibt Informationen über Personenobjekt zurück
 *
 *
 * 
 *
 */

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
	@DisplayName("createPerson(PersonType personType, String name, LanguageType languageType): is PersonType of created Person LEGALPERSON")
	void createTest() {
		assertEquals(PersonType.LEGALPERSON, person.getPersonType());
	}

	@Test
	@DisplayName("deletePerson(): is PersonObject null after delete operation")
	void deleteTest() {

		personService.deletePerson();

		assertEquals(null, personService.getPerson());

	}

	@Test
	@DisplayName("printPerson(): if Person is legal, then company")
	void printPerson() {
		person = personService.getPerson();
		if (person.getPersonType() == PersonType.LEGALPERSON)
			assertEquals("Sie vertreten ein Unternehmen. Dessen Name ist " + personService.printPerson().getName(),
					"Sie vertreten ein Unternehmen. Dessen Name ist " + person.getName());

	}

}
