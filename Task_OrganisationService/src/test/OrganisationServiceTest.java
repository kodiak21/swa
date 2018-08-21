package test;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controller.OrganisationServiceController;
import model.LanguageType;
import model.OrganisationService;
import model.Person;
import model.PersonService;
import model.PersonType;
import model.User;
import model.UserGroup;
import model.UserIndividual;

class OrganisationServiceTest {

	private PersonService personService;
	private OrganisationService organisationService;
	private Person person;
	private User user;

	private UserGroup userGroup;
	private OrganisationServiceController organisationServiceController;
	
	Stack<User> usersReverse; 

	@BeforeEach
	void setUp() throws Exception {
		personService = new PersonService();
		organisationService = new OrganisationService();
		personService.createPerson(PersonType.NATURALPERSON, "Meier", LanguageType.GERMAN);
		person = personService.getPerson();
		userGroup = new UserGroup(person);

		user = new UserIndividual(person);
		userGroup.add(user);

		organisationServiceController = new OrganisationServiceController();

		organisationService.createUser(person);
		usersReverse = new Stack<User>();
		usersReverse.add(user);
	}

	@AfterEach
	void tearDown() throws Exception {
		personService = null;
		organisationService = null;
		person = null;
		userGroup = null;
		user = null;
		organisationServiceController = null;
		usersReverse = null;
		
	}

	@Test
	@DisplayName("createUser(): is person named Meier part of organisation")
	void createUser() {

		assertEquals("Meier", organisationService.getUser().getPerson().getName());
	}

	
	
	@Test
	@DisplayName("deleteUser(): is PersonObject after delete operation null")
	void deleteUser() {

		organisationService.deleteUser();
		assertEquals(null, organisationService.getUser());
	}
	
	@Test
	@DisplayName("printUser(): is listed person named Meier")
	void printUser() {
		user = usersReverse.pop();
		assertEquals("Meier", organisationService.getUser().getPerson().getName());
	}
	
	@Test
	@DisplayName("organisationCommand(): test of OrganisationServiceController")
	void testController() {
		organisationService = organisationServiceController.organisationCommand(personService.getPerson());
	}
}
