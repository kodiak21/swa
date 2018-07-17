package controller;

import model.OrganisationService;

public class DeleteUserAction implements OrganisationServiceAction {

	@Override
	public OrganisationService action(OrganisationService organisationService) {
			organisationService.deleteUser();
		return organisationService;
	}

}
