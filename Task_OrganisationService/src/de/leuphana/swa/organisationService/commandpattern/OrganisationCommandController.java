package de.leuphana.swa.organisationService.commandpattern;

import java.io.IOException;

import de.leuphana.swa.organisationService.UserGroup;
import de.leuphana.swa.organisationService.UserIndividual;
import de.leuphana.swa.organisationService.UserOrganisationUnit;

import de.leuphana.swa.organisationService.commandpattern.CreateOrganisation;
import de.leuphana.swa.organisationService.commandpattern.realisations.AddGroupToOrganisationCommand;
import de.leuphana.swa.organisationService.commandpattern.realisations.AddUserToUsergroupCommand;
import de.leuphana.swa.organisationService.commandpattern.realisations.AskGroupNameCommand;
import de.leuphana.swa.organisationService.commandpattern.realisations.AskOrgUnitNameCommand;
import de.leuphana.swa.organisationService.commandpattern.realisations.CreatePersonCommand;
import de.leuphana.swa.organisationService.commandpattern.realisations.DeleteGroupFromOrganisationCommand;
import de.leuphana.swa.organisationService.commandpattern.realisations.DeletePersonCommand;
import de.leuphana.swa.organisationService.commandpattern.realisations.DeleteUserFromUsergroupCommand;
import de.leuphana.swa.organisationService.commandpattern.realisations.PrintUserInformationCommand;
import de.leuphana.swa.organisationService.view.OrganisationView;
import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;
import de.leuphana.swa.personService.UserFactory;

public class OrganisationCommandController {

	//Command pattern established
	
	public static void main(final String[] args) throws IllegalArgumentException, IOException {

		String name = "John Moeller";
		PersonType personType = PersonType.LEGALPERSON;
		
		final UserFactory userFactory = new UserFactory();
		
		final CreateOrganisation createOrganisation = new CreateOrganisation();
		
		final OrganisationView organisationView = new OrganisationView();
		
		final CreatePersonCommand createPerson = new CreatePersonCommand(userFactory, personType, name);
		
		Person p1 = createOrganisation.createPerson(createPerson);
		Person p2 = createOrganisation.createPerson(createPerson);
		Person p3 = createOrganisation.createPerson(createPerson);
		
		final DeletePersonCommand deletePerson = new DeletePersonCommand(p1);
		
		p3 = createOrganisation.deletePerson(deletePerson);
		
		p3 = createOrganisation.createPerson(createPerson);
		
		if(personType == PersonType.NATURALPERSON) {
			UserIndividual usr1 = new UserIndividual(p1);
		}else if(personType == PersonType.LEGALPERSON) {
			
			UserIndividual usr1 = new UserIndividual(p1);
			
			UserGroup usergroup1 = new UserGroup(p2);
			
			final AddUserToUsergroupCommand addUser = new AddUserToUsergroupCommand(usergroup1, usr1);
			
			final DeleteUserFromUsergroupCommand removeUser = new DeleteUserFromUsergroupCommand(usergroup1, usr1);
			
			createOrganisation.addUserToGroup(addUser);
			
			createOrganisation.deleteUserFromGroup(removeUser);
			
			createOrganisation.addUserToGroup(addUser);
			
			UserOrganisationUnit org1 = new UserOrganisationUnit(p3);
			
			final AddGroupToOrganisationCommand addGroup = new AddGroupToOrganisationCommand(org1, usergroup1);
			
			final DeleteGroupFromOrganisationCommand removeGroup = new DeleteGroupFromOrganisationCommand(org1, usergroup1);
			
			createOrganisation.addGroupToOrganisation(addGroup);
			
			createOrganisation.deleteGroupFromOrganisation(removeGroup);
			
			createOrganisation.addGroupToOrganisation(addGroup);
			
			final PrintUserInformationCommand printInfo = new PrintUserInformationCommand(org1);
			
			createOrganisation.printUserInformation(printInfo);
			
//			final AskOrgUnitNameCommand askUnit = new AskOrgUnitNameCommand(ov);
//			co.askOrgUnitName(askUnit);
//			final AskGroupNameCommand askGroup = new AskGroupNameCommand(ov);
//			co.askGroupName(askGroup);
			
		}
		
	}
}
