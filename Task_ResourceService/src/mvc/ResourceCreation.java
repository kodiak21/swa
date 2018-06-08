package mvc;

import java.util.ArrayList;
import java.util.List;

public class ResourceCreation {
	private List<Command> history = new ArrayList<Command>();

	public void storeAndExecute(final Command cmd, ResourcePicked resourcePicked) {
		this.history.add(cmd); // optional
		cmd.execute(resourcePicked);
	}
}
