package de.leuphana.swa.organisationService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserOrganisationUnit extends User {

	List<User> users = new ArrayList<User>();
	
	protected UserOrganisationUnit(String userName, int userId) {
		super(userName, userId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printUserInformation() {
		System.out.println("-------------");
		System.out.println("Organisationsname= " + getName());
		System.out.println("Organisationsgröße= " + countUser());
		System.out.println("-------------");

		Iterator<User> userIterator = users.iterator();
		while (userIterator.hasNext()) {
			User user = userIterator.next();
			user.printUserInformation();
		}	
	}
	
	@Override
	int countUser() {
		int count = 0;
		for (User user: users) {
			count += user.countUser();
		}
		return count;
	}
	
	public void add(User user) {
		this.users.add(user);
	}
	
	public void remove(User user) {
			this.users.remove(user);
	}
}
