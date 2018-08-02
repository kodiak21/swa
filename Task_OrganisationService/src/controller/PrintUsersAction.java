package controller;

import java.util.Stack;

import model.OrganisationService;
import model.User;
import view.PrintUsersView;

public class PrintUsersAction implements OrganisationServiceAction {

	@Override
	public OrganisationService action(OrganisationService organisationService) {
			Stack<User> answer;
			answer = organisationService.getUsers();
			PrintUsersView printUsersView = new PrintUsersView();
			printUsersView.showView(answer);
		return organisationService;
	}

}
