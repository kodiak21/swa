package de.leuphana.swa.resourceService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.resourceService.commandpattern.ResourceCommand;
import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.TopBox;
import de.leuphana.swa.resourceService.resource.Resource;
import de.leuphana.swa.resourceService.view.ResourceView;

public class PrintMenuCommand implements ResourceCommand {

	private ResourceView resourceView;

	private Resource resource;
	private TopBox topbox;
	private ChildSeat childseat;

	public PrintMenuCommand(final ResourceView resourceView, Resource resource, TopBox topbox, ChildSeat childSeat) {
		this.resourceView = resourceView;
		this.resource = resource;
		this.topbox = topbox;
		this.childseat = childSeat;
	}

	@Override
	public void voidExecute() {
		resourceView.printMenu(resource, topbox, childseat);
	}

	@Override
	public int intExecute() {
		return 0;
	}

	@Override
	public String stringExecute() throws IllegalArgumentException, IOException {
		return null;
	}

}
