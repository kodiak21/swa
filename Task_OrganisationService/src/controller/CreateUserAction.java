package controller;

import model.OrganisationService;
import model.Person;

/**<b> Übergeordneter Service</b>: OrganisationService<br>
 * 
 * <br>
 * <b>CreateUserAction:</b> Ein Personenobjekt wird einer Organisation zugeordnet
 * 
 * @param person - PersonenObjekt
 * 
 *
 */

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
