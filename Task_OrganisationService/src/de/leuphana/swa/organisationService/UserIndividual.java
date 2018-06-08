package de.leuphana.swa.organisationService;

public class UserIndividual implements User{

	private int userId;
	private int userGroupId;
	private String userNameIndividual;
	
	public UserIndividual(int userId, String userNameIndividual) {
		this.setUserId(userId);
		this.userNameIndividual = userNameIndividual;
	}
	
	@Override
	public void add(User user) {}

	@Override
	public void remove(User user) {}

	@Override
	public void add(UserGroup usergroup) {}

	@Override
	public void remove(UserGroup usergroup) {}

	@Override
	public int getUserGroupId() {
		return userGroupId;
	}

	@Override
	public String getName() {
		return userNameIndividual;
	}

	@Override
	public void print() {
		System.out.println("-------------");
		System.out.print("Name= " + getName());
		System.out.println("-------------");		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
