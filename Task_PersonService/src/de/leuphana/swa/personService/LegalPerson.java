package de.leuphana.swa.personService;

public class LegalPerson extends Person {

	
	private String name;

	public LegalPerson(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPersonType(PersonType personType) {
		return personType.toString();
		
	}

}
