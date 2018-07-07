package de.leuphana.swa.organisationService.commandpattern;

import java.io.IOException;

import de.leuphana.swa.personService.Person;

public interface OrganisationCommand {
	Person createPerson();
	Person removePerson();
	
	void addUserToGroup();
	void addGroupToOrganisation();
	
	void deleteUserFromGroup();
	void deleteGroupFromOrganisation();
	void printUserInformation();
	
	String askGroupName() throws IOException;
	String askOrgUnitName() throws IOException;
	
	int shouldPersonAddedGroup() throws IOException;
	int shouldPersonRemovedGroup() throws IOException;
	
	int shouldGroupAddedOrgUnit() throws IOException;
	int shouldGroupRemovedOrgUnit() throws IOException;
	
}
