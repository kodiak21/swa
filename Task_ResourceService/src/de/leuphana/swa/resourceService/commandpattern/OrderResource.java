package de.leuphana.swa.resourceService.commandpattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderResource {
	private List<ResourceCommand> history = new ArrayList<ResourceCommand>();

	public void storeAndVoidExecute(final ResourceCommand cmd) throws IllegalArgumentException, IOException {
		this.history.add(cmd); // optional
		cmd.voidExecute();
	}

	public int storeAndIntExecute(final ResourceCommand cmd) throws IllegalArgumentException, IOException {
		this.history.add(cmd); // optional
		int i = cmd.intExecute();
		return i;
	}
	
	public String storeAndStringExecute(final ResourceCommand cmd) throws IllegalArgumentException, IOException {
		this.history.add(cmd); // optional
		String s = cmd.stringExecute();
		return s;
	}
}
