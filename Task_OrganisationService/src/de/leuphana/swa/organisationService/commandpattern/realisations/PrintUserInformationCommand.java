package de.leuphana.swa.organisationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.organisationService.commandpattern.OrganisationCommand;
import model.Person;
import model.UserOrganisationUnit;

public class PrintUserInformationCommand implements OrganisationCommand {

	private UserOrganisationUnit orgUnit;
	
	public PrintUserInformationCommand(final UserOrganisationUnit org1) {
		this.orgUnit = org1;
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
	public void printUserInformation() {
		orgUnit.printUserInformation();
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
	public String askGroupName() {
		return null;
		
	}
	
	@Override
	public String askOrgUnitName() throws IOException {
		// TODO Auto-generated method stub
		return null;
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
