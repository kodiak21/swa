package controller;

import model.OrganisationService;
import model.Person;

public class CreateUserAction implements OrganisationServiceAction{
	
	Person person;
	
	public CreateUserAction(Person person) {
		this.person = person;
	}
	
	@Override
	public OrganisationService action(OrganisationService organisationService) {
		organisationService.createUser(person);
		return organisationService;
	}

}
