package de.leuphana.swa.organisationService;

import de.leuphana.swa.personService.Person;

abstract class User {
	
	static int nextUserId = 1;
	int userId;
	Person person;
	
	abstract void printUserInformation();
	abstract int countUser();
	
	protected User(Person person) {
		this.userId = nextUserId++;
		this.person = person;
	}
	
	public String getName() {
		return person.getName();
	}
	
	public int getUserId() {
		return userId;
	}

}
