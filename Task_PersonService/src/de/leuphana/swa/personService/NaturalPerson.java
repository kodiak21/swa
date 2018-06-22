package de.leuphana.swa.personService;

public class NaturalPerson extends Person {

	public NaturalPerson(String name) {
		this.name = name;
		this.personType = PersonType.NATURALPERSON;
	}
	
	
	@Override
	public String getName() {
		return name;
	}


	@Override
	public PersonType getPersonType (){
		return this.personType;
		
	}

}
