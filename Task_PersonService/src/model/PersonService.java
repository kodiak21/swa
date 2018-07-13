package model;

public class PersonService {
	
	String name;
	PersonType personType;
	Person person;
		
	public void createPerson (PersonType personType, String name) {
		UserFactory userfactory = new UserFactory();
		this.person = userfactory.createPerson(personType,name);
	}
	
	public void deletePerson() {
		this.person = null;
	}
	
	public Person printPerson() {
		return this.person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonType getPersonType() {
		return personType;
	}

	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
