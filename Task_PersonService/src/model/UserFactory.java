package model;

public class UserFactory {

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
