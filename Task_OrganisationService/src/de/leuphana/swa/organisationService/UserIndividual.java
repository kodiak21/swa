package de.leuphana.swa.organisationService;

public class UserIndividual extends User{
	
	protected UserIndividual(String userName, int userId) {
		super(userName, userId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printUserInformation() {
		System.out.println("Name= " + getName());
	}

	@Override
	int countUser() {
		// TODO Auto-generated method stub
		return 1;
	}

}
