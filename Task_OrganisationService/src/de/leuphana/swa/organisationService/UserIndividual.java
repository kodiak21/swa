package de.leuphana.swa.organisationService;

import model.Person;

public class UserIndividual extends User{
	
	public UserIndividual(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printUserInformation() {
		System.out.println("Name= " + getName());
	}

	@Override
	int countUser() {
		// TODO Auto-generated method stub
		return 1;
	}

}
