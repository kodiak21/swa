package de.leuphana.swa.organisationService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserGroup implements User {

	List<User> users = new ArrayList<User>();

	private String userName;

	private int userGroupId;

	public UserGroup(int userGroupId, String userName) {
		this.userName = userName;
		this.userGroupId = userGroupId;
	}

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void remove(User user) {
		users.remove(user);
	}

	@Override
	public String getName() {
		return userName;
	}

	@Override
	public void print() {
		System.out.println("-------------");
		System.out.print("Name= " + getName());
		System.out.println("-------------");

		Iterator<User> userIterator = users.iterator();
		while (userIterator.hasNext()) {
			User user = userIterator.next();
			user.print();
		}

	}

	@Override
	public void add(UserGroup usergroup) {}

	@Override
	public void remove(UserGroup usergroup) {}

	@Override
	public int getUserGroupId() {
		return userGroupId;	
	}
	
}
