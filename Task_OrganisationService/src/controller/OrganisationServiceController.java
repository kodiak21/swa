package controller;

import model.OrganisationService;
import model.Person;

public class OrganisationServiceController {
	public OrganisationService organisationCommand(Person person) {		
		
		OrganisationService organisationService;
		organisationService = new OrganisationService();
		
		CreateUserAction createUserAction = new CreateUserAction(person);
		organisationService = createUserAction.action(organisationService);
		
		PrintUserAction printUserAction = new PrintUserAction();
		organisationService = printUserAction.action(organisationService);
		
		return organisationService;
	}

}
