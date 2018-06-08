package mvc;

public class UserGroupCommand implements Command {

	private UserGroup theUser;
	private String name;
	private int userId;
	
	public UserGroupCommand(final UserGroup theUser, final String name, final int userId) {
		this.theUser = theUser;
		this.name = name;
		this.userId = userId;
	}
	
	@Override
	public void execute() {
		theUser.individualUserGroupCreated(name, userId);
	}

}
