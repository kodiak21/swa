package mvc.organisation;

public class UserGroupCommand implements CommandGroup {

	private UserGroup userGroup;
	private String name;
	private int userId;
	
	public UserGroupCommand(final UserGroup userGroup, final String name, final int userId) {
		this.userGroup = userGroup;
		this.name = name;
		this.userId = userId;
	}
	
	@Override
	public void execute() {
		userGroup.individualUserGroupCreated(name, userId);
	}

}
