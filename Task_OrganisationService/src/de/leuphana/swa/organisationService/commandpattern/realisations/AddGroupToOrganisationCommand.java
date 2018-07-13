package de.leuphana.swa.organisationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.organisationService.commandpattern.OrganisationCommand;
import model.Person;
import model.UserGroup;
import model.UserOrganisationUnit;

public class AddGroupToOrganisationCommand implements OrganisationCommand {
	
	private UserOrganisationUnit orgUnit;
	private UserGroup userGroup;
	
	public AddGroupToOrganisationCommand(final UserOrganisationUnit orgUnit, UserGroup userGroup) {	
		this.orgUnit = orgUnit;
		this.userGroup = userGroup;
	}
	
	
	@Override
	public void addUserToGroup() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addGroupToOrganisation() {
		orgUnit.add(userGroup);	
	}


	@Override
	public void printUserInformation() {
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
