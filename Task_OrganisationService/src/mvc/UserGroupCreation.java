package mvc;

import java.util.ArrayList;
import java.util.List;

public class UserGroupCreation {
	private List<Command> history = new ArrayList<Command>();

	public void storeAndExecute(final Command cmd) {
		this.history.add(cmd); // optional
		cmd.execute();
	}
}
