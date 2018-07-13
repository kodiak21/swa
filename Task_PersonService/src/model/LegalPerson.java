package model;

public class LegalPerson extends Person {

	
	public LegalPerson(String name, LanguageType language) {
		this.language = language;
		this.name = name;
		this.personType = PersonType.LEGALPERSON;
	}
	

}
