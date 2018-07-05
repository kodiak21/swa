package de.leuphana.swa.resourceService.commandpattern;

import java.io.IOException;

public interface ResourceCommand {
	void voidExecute() throws IllegalArgumentException, IOException;
	int intExecute() throws IllegalArgumentException, IOException;
	String stringExecute() throws IllegalArgumentException, IOException;
}
