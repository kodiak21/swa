package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.leuphana.swa.personService.LegalPerson;
import de.leuphana.swa.personService.Person;

class isNameCorrect {

	private Person person;
	private String name;
	
	@BeforeEach
	void setUp() throws Exception {
		name = "John";
		person = new LegalPerson(name);
	}

	@AfterEach
	void tearDown() throws Exception {
		person = null;
	}

	@Test
	@DisplayName("getName(): is name equals John") 
	void test() {
		assertEquals("John", person.getName());
	}

}
