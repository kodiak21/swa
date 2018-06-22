package mvc.organisation;

import java.util.ArrayList;
import java.util.List;

public class UserGroupCreation {
	private List<CommandGroup> history = new ArrayList<CommandGroup>();

	public void storeAndExecute(final CommandGroup cmd) {
		this.history.add(cmd); // optional
		cmd.execute();
	}
}
