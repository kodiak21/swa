package de.leuphana.swa.organisationService;

public class Client {

	//OrganisationService nach Composite Pattern
	
	public static void main(String[] args) {
		UserIndividual usr1 = new UserIndividual(1,"John");
		UserIndividual usr2 = new UserIndividual(2,"David");
		
		UserGroup usergroup1 = new UserGroup(10, "IT");
		UserGroup usergroup2 = new UserGroup(20,"Software");
		usergroup1.add(usr1);
		usergroup2.add(usr2);
		
		UserOrganisationUnit org1 = new UserOrganisationUnit(100, "KI");
		org1.add(usergroup1);
		org1.add(usergroup2);
		
		org1.print();
	}

}
