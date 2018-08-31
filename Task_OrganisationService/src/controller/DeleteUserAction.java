package controller;

import model.OrganisationService;

/**<b> Übergeordneter Service</b>: OrganisationService<br>
 * 
 * <br>
 * <b>DeleteUserAction:</b> Ein Personenobjekt wird aus einer Organisation gelöscht
 * 
 * 
 *
 */

public class DeleteUserAction implements OrganisationServiceAction {

	@Override
	public OrganisationService action(OrganisationService organisationService) {
			organisationService.deleteUser();
		return organisationService;
	}

}
