package de.leuphana.swa.organisationService;

public class Client {

	//OrganisationService nach Composite Pattern
	
	public static void main(String[] args) {
		UserIndividual usr1 = new UserIndividual("John",1);
		UserIndividual usr2 = new UserIndividual("David",2);
		UserIndividual usr3 = new UserIndividual("Max",3);
		UserIndividual usr4 = new UserIndividual("Susi",4);
		UserIndividual usr5 = new UserIndividual("Anja",5);
		UserIndividual usr6 = new UserIndividual("John",6);
		
		UserGroup usergroup1 = new UserGroup("IT", 10);
		UserGroup usergroup2 = new UserGroup("Software",20);
		usergroup1.add(usr1);
		usergroup1.add(usr2);
		usergroup2.add(usr3);
		usergroup2.add(usr4);
		usergroup2.add(usr5);
		usergroup2.add(usr6);
		
		UserOrganisationUnit org1 = new UserOrganisationUnit("KI", 100);
		org1.add(usergroup1);
		org1.add(usergroup2);
		
		org1.printUserInformation();
	}

}
