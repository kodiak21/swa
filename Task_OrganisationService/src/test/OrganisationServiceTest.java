package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.OrganisationServiceController;
import model.LanguageType;
import model.Person;
import model.PersonService;
import model.PersonType;

class OrganisationServiceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		PersonService personService = new PersonService();
		personService.createPerson(PersonType.NATURALPERSON, "Meier", LanguageType.GERMAN);
		Person person = personService.getPerson();
		OrganisationServiceController organisationServiceController = new OrganisationServiceController();
		organisationServiceController.organisationCommand(person);
	}

}
