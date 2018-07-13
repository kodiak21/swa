package de.leuphana.swa.organisationService.commandpattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.leuphana.swa.organisationService.commandpattern.realisations.DeleteGroupFromOrganisationCommand;
import model.Person;

public class CreateOrganisation {
	private List<OrganisationCommand> history = new ArrayList<OrganisationCommand>();

	public Person createPerson(final OrganisationCommand cmd) {
		this.history.add(cmd); // optional
		Person p = cmd.createPerson();
		return p;
	}
	
	public Person deletePerson(final OrganisationCommand cmd) {
		this.history.add(cmd); // optional
		Person p = cmd.removePerson();
		return p;
	}
	
	public void addUserToGroup(final OrganisationCommand cmd) {
		this.history.add(cmd); // optional
		cmd.addUserToGroup();
	}
	
	public void addGroupToOrganisation(final OrganisationCommand cmd) {
		this.history.add(cmd); // optional
		cmd.addGroupToOrganisation();
	}
	
	public void deleteUserFromGroup(final OrganisationCommand cmd) {
		this.history.add(cmd); // optional
		cmd.deleteUserFromGroup();
	}
	
	public void deleteGroupFromOrganisation(final OrganisationCommand cmd) throws IllegalArgumentException, IOException {
		this.history.add(cmd); // optional
		cmd.deleteGroupFromOrganisation();
	}
	
	public void printUserInformation(final OrganisationCommand cmd) throws IllegalArgumentException, IOException {
		this.history.add(cmd); // optional
		cmd.printUserInformation();
	}
	
	public void askGroupName(final OrganisationCommand cmd) throws IllegalArgumentException, IOException {
		this.history.add(cmd);
		cmd.askGroupName();
	}
	
	public void askOrgUnitName(final OrganisationCommand cmd) throws IllegalArgumentException, IOException {
		this.history.add(cmd);
		cmd.askOrgUnitName();
	}
	
	public void shouldPersonAddedGroup(final OrganisationCommand cmd) throws IllegalArgumentException, IOException {
		this.history.add(cmd);
		cmd.shouldPersonAddedGroup();
	}
	
	
	
}
