package de.leuphana.swa.organisationService;

abstract class User {
	
	int userId;
	String userName;
	
	
	abstract void printUserInformation();
	abstract int countUser();
	
	protected User(String userName, int userId) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public String getName() {
		return userName;
	}
	
	public int getUserId() {
		return userId;
	}
	

}
