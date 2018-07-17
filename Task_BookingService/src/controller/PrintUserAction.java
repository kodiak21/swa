package controller;

import model.OrganisationService;
import view.PrintUserView;

public class PrintUserAction implements OrganisationServiceAction {

	@Override
	public OrganisationService action(OrganisationService organisationService) {
		PrintUserView printUserView = new PrintUserView();
		printUserView.showView(organisationService.printUser());
		return organisationService;
	}

}
