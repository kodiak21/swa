package de.leuphana.swa.organisationService;

import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;
import de.leuphana.swa.personService.UserFactory;

public class Client {

	//OrganisationService nach Composite Pattern
	
	public static void main(String[] args) {
		
		String name = "John Moeller";		
		PersonType personType = PersonType.LEGALPERSON;		

		UserFactory userFactory = new UserFactory();
		Person person1 = userFactory.createPerson(personType,name);
		Person person2 = userFactory.createPerson(personType,name);
		Person person3 = userFactory.createPerson(personType,name);
		
		
		
		//createUser(Person person);
		//if NATURALPERSON
		UserIndividual usr1 = new UserIndividual(person1);

		
		//if LEGALPERSON
		UserGroup userGroup1 = new UserGroup(person2);
		userGroup1.add(usr1);
		
		UserOrganisationUnit org1 = new UserOrganisationUnit(person3);
		org1.add(userGroup1);
		
		//deleteUser(User user);
		//this.user = null;
		//TODO
		
		
		//printUser()
		org1.printUserInformation();
		System.out.println(org1.getUserId());
		System.out.println(userGroup1.getUserId());
		System.out.println(usr1.getUserId());
	}

}
