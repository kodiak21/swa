package de.leuphana.swa.organisationService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserOrganisationUnit implements User {

	List<UserGroup> usergroups = new ArrayList<UserGroup>();

	private String name;
	private int id;

	private int userGroupId;

	private int userOrganisationUnitId;
	
	public UserOrganisationUnit(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void add(User user) {}

	@Override
	public void remove(User user) {}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void print() {
		System.out.println("-------------");
		System.out.print("Name= " + getName());
		System.out.println("-------------");

		Iterator<UserGroup> userGroupIterator = usergroups.iterator();
		while (userGroupIterator.hasNext()) {
			User userGroup = userGroupIterator.next();
			userGroup.print();
		}

	}

	@Override
	public void add(UserGroup usergroup) {
		usergroups.add(usergroup);
	}

	@Override
	public void remove(UserGroup usergroup) {
		usergroups.remove(usergroup);
	}

	@Override
	public int getUserGroupId() {
		return userGroupId;
	}

}
