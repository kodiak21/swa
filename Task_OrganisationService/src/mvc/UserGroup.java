package mvc;

public class UserGroup {

	public void individualUserGroupCreated(String name, int userId) {
		
		de.leuphana.swa.organisationService.UserGroup userGroup = new de.leuphana.swa.organisationService.UserGroup(
				userId, name);
		
		System.out.println("Group " + userGroup.getName() + " has Id " + userGroup.getUserGroupId());
	}
}
