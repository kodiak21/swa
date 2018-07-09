package de.leuphana.swa.organisationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.organisationService.commandpattern.OrganisationCommand;
import de.leuphana.swa.organisationService.view.OrganisationView;
import de.leuphana.swa.personService.Person;

public class AskOrgUnitNameCommand implements OrganisationCommand {

	private OrganisationView organisationView;

	public AskOrgUnitNameCommand(final OrganisationView organisationView) {
		this.organisationView = organisationView;
	}

	@Override
	public Person createPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person removePerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUserToGroup() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addGroupToOrganisation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserFromGroup() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGroupFromOrganisation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printUserInformation() {
		// TODO Auto-generated method stub

	}

	@Override
	public String askGroupName() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String askOrgUnitName() throws IOException {
		String orgUnitName = organisationView.askOrgUnitName();
		return orgUnitName;
	}
	
	@Override
	public int shouldPersonAddedGroup() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int shouldPersonRemovedGroup() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int shouldGroupAddedOrgUnit() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int shouldGroupRemovedOrgUnit() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

}