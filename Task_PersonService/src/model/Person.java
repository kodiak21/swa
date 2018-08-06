package model;

public abstract class Person {
	
	String name;
	PersonType personType;
	LanguageType language;
	
	public LanguageType getLanguageType() {
		return language;
	}

	public void setLanguage(LanguageType language) {
		this.language = language;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}

	public String getName() {
		return name;
	}
	
	public PersonType getPersonType (){
		return this.personType;
	}
	
}
