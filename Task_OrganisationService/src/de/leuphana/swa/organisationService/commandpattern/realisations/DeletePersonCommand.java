package de.leuphana.swa.organisationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.organisationService.commandpattern.OrganisationCommand;
import de.leuphana.swa.personService.Person;

public class DeletePersonCommand implements OrganisationCommand {

	private Person person;
	
	public DeletePersonCommand(Person p1) {
		this.person = p1;
	}

	@Override
	public Person createPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person removePerson() {
		Person p = null;
		return p;
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
