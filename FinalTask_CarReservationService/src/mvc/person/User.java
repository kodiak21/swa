package mvc.person;

import java.util.ArrayList;
import java.util.List;

import de.leuphana.swa.personService.LegalPerson;
import de.leuphana.swa.personService.NaturalPerson;
import de.leuphana.swa.personService.Person;
import mvc.organisation.UserGroup;

public class User {
	
	List<User> users = new ArrayList<User>();
	
	public void naturalUserCreated(String name) {
	    
		Person p = new NaturalPerson(name);
		System.out.println(p.getName() + " is natural person");
	}

	public void legalUserCreated(String name) {
		Person p = new LegalPerson(name);
		System.out.println(p.getName() + " is legal person");
		
	}
	
	public void userAddedtoGroup(User user, UserGroup usergroup) {
		users.add(user);
	}

}
