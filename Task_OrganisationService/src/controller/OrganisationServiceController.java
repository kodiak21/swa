package controller;

import model.OrganisationService;
import model.Person;

/**<b> Übergeordneter Service</b>: OrganisationService<br>
 * 
 * <br><b>OrganisationServiceController:</b> Controller, der alle OrganisationService bezogenen Actions verwaltet<br> 
 * 
 * <br><b>verwaltete Aktionen:</b> Funktionen werden in den einzelnen Klassen erläutert<br>
 * 
 * <br> - CreateUserAction
 * <br> - PrintUserAction
 * 
 *
 */


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
