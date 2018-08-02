package model;

import java.util.Stack;

public class OrganisationService {
	
	String 					name;
	PersonType 				personType;		
	LanguageType 			language;
	User 					user;
	UserGroup 				userGroupIndividual;
	UserGroup 				userGroupOrganisation;
	UserOrganisationUnit 	userGroupUsers;
	UserOrganisationUnit 	userGroupAdmins;
	UserOrganisationUnit 	userGroupALL;
	
	public OrganisationService() {
		UserFactory userFactory = new UserFactory();
		Person person1 = userFactory.createPerson(PersonType.LEGALPERSON,"Unternehmen", LanguageType.GERMAN);
		Person person2 = userFactory.createPerson(PersonType.NATURALPERSON,"Privatpersonen", LanguageType.GERMAN);
		Person person3 = userFactory.createPerson(PersonType.NATURALPERSON,"Angestellte", LanguageType.GERMAN);
		Person person4 = userFactory.createPerson(PersonType.NATURALPERSON,"Nutzer", LanguageType.GERMAN);
		Person person5 = userFactory.createPerson(PersonType.NATURALPERSON,"Alle Nutzer", LanguageType.GERMAN);
		userGroupIndividual = 		new UserGroup(person1);
		userGroupOrganisation = 	new UserGroup(person2);
		userGroupAdmins = 			new UserOrganisationUnit(person3);
		userGroupUsers = 			new UserOrganisationUnit(person4);
		userGroupALL = 				new UserOrganisationUnit(person5);
		userGroupUsers.add(userGroupIndividual);
		userGroupUsers.add(userGroupOrganisation);
		userGroupALL.add(userGroupUsers);
		userGroupALL.add(userGroupAdmins);
	}

	public void createUser(Person person) {
		if (person.getPersonType()==PersonType.NATURALPERSON) {
			this.user = new UserIndividual(person);
			this.userGroupIndividual.add(this.user);
		} else {
			this.user = new UserOrganisationUnit(person);
			this.userGroupOrganisation.add(this.user);
		}
	}

	public void deleteUser() {
		if(this.user.getClass().getSimpleName().equals("UserIndividual")){
			this.userGroupIndividual.remove(user);
		} else {
			this.userGroupOrganisation.remove(user);
		}
		this.user = null;
	}
	
	public Stack<User> getUsers() {
		
		Stack<User> answer = new Stack<User>();
		answer = userGroupALL.printUserInformation();

		return answer;
	}
	
	public User getUser() {
		return this.user;
	}
}
