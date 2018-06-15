package de.leuphana.swa.personService;

public class NaturalPerson extends Person {

	private String name;


	public NaturalPerson(String name) {
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
