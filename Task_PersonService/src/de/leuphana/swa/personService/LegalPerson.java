package de.leuphana.swa.personService;

public class LegalPerson extends Person {

	
	public LegalPerson(String name) {
		this.name = name;
		this.personType = PersonType.LEGALPERSON;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public PersonType getPersonType() {
		return this.personType;
		
	}

}
