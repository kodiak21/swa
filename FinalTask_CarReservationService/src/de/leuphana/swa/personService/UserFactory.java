package de.leuphana.swa.personService;

public class UserFactory {

	private String name;

	public Person createPerson(PersonType personType, String name) {
		
		switch(personType) {
		case NATURALPERSON:
			return new NaturalPerson(name);
		case LEGALPERSON:
			return new LegalPerson(name);
		}
		
		return null;
		
	}
	
}
