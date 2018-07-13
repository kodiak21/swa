package de.leuphana.swa.organisationService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.organisationService.commandpattern.OrganisationCommand;
import model.Person;
import model.PersonType;
import model.UserFactory;

public class CreatePersonCommand implements OrganisationCommand {

	private UserFactory userFactory;
	private PersonType personType;
	private String name;
	
	public CreatePersonCommand(final UserFactory userFactory, PersonType personType, String name) {
		this.userFactory = userFactory;
		this.personType = personType;
		this.name = name;
	}
	

	@Override
	public Person createPerson(){
		Person p = userFactory.createPerson(personType, name);
		return p;
	}


	@Override
	public void addUserToGroup() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addGroupToOrganisation(){
		// TODO Auto-generated method stub
		
	}


	@Override
	public void printUserInformation() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteUserFromGroup()  {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteGroupFromOrganisation() {
		// TODO Auto-generated method stub
		
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
