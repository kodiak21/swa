package model;

public class PersonService {
	
	Person person;
	int deleteAnswer;
		
	public void createPerson (PersonType personType, String name, LanguageType language) {
		UserFactory userfactory = new UserFactory();
		this.person = userfactory.createPerson(personType,name, language);
	}
	
	public void deletePerson() {
		this.person = null;
	}
	
	public Person printPerson() {
		return this.person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void setDeleteAnswer(int deleteAnswer) {
		this.deleteAnswer = deleteAnswer;
		
	}
	
	public int getDeleteAnswer() {
		return deleteAnswer;
	}
	
}
