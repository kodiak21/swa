package mvc;

import de.leuphana.swa.personService.LegalPerson;
import de.leuphana.swa.personService.NaturalPerson;
import de.leuphana.swa.personService.Person;

public class User {
	public void naturalUserCreated(String name) {
	    
		Person p = new NaturalPerson(name);
		System.out.println(p.getName() + " is natural person");
	}

	public void legalUserCreated(String name) {
		Person p = new LegalPerson(name);
		System.out.println(p.getName() + " is legal person");
		
	}
}
