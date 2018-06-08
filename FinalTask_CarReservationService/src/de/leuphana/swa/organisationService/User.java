package de.leuphana.swa.organisationService;

public interface User {
	
	public void add(User user);
	public void remove(User user);
	
	public void add(UserGroup usergroup);
	public void remove(UserGroup usergroup);
	
	public int getUserGroupId();
	
	public String getName();
	public void print();
}
