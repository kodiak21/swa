package model;

public class UserFactory {

	public Person createPerson(PersonType personType, String name, LanguageType language) {
		
		switch(personType) {
		case NATURALPERSON:
			return new NaturalPerson(name, language);
		case LEGALPERSON:
			return new LegalPerson(name, language);
		}
		
		return null;
		
	}
	
}
