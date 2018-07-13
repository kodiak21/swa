package model;

public class NaturalPerson extends Person {

	public NaturalPerson(String name, LanguageType language) {
		this.language = language;
		this.name = name;
		this.personType = PersonType.NATURALPERSON;
	}

}
