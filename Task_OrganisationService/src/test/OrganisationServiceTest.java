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
import model.UserOrganisationUnit;

class OrganisationServiceTest {

	private PersonService personService;
	private OrganisationService organisationService;
	private Person person;
	private User user;

	private UserGroup userGroup;
	private OrganisationServiceController organisationServiceController;
	
	Stack<User> usersForward;
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

		
		usersForward = new Stack<User>();
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
	@DisplayName("createUser(Person person): is person named Meier part of organisation")
	void createUser() {
		organisationService.createUser(person);
		assertEquals("Meier", organisationService.getUser().getPerson().getName());
	}

	
	
	@Test
	@DisplayName("deleteUser(): is PersonObject after delete operation null")
	void deleteUser() {
		organisationService.createUser(person);
		organisationService.deleteUser();
		assertEquals(null, organisationService.getUser());
	}
	
	@Test
	@DisplayName("getUsers(): is name of person in List usersReverse Meier")
	void getUsers() {
		usersForward = organisationService.getUsers();
		
		usersReverse = new Stack<User>();
		while (!usersForward.isEmpty()) {
			usersReverse.push(usersForward.pop());
		}
		
		while (!usersReverse.isEmpty()) {
			user = usersReverse.pop();
			if (user.getClass().getSimpleName().equals("UserIndividual")) {
				assertEquals("-Name: Meier", "-Name: "+ user.getPerson().getName());
			} 
		}
		
	}
	
	@Test
	@DisplayName("organisationCommand(Person person): test of OrganisationServiceController")
	void testOrganisationServiceController() {
		organisationService = organisationServiceController.organisationCommand(personService.getPerson());
	}
}
