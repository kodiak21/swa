package de.leuphana.swa.resourceService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.resourceService.commandpattern.ResourceCommand;
import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.TopBox;
import de.leuphana.swa.resourceService.resource.Resource;
import de.leuphana.swa.resourceService.view.ResourceView;

public class PrintOrderCommand implements ResourceCommand {

	private ResourceView resourceView;

	private Resource resource;
	private TopBox topbox;
	private ChildSeat childseat;
	private int max;
	private String name;
	

	public PrintOrderCommand(final ResourceView resourceView, Resource resource, TopBox topbox, ChildSeat childSeat, int max, String name) {
		this.resourceView = resourceView;
		this.resource = resource;
		this.topbox = topbox;
		this.childseat = childSeat;
		this.max = max;
		this.name = name;
	}
	
	@Override
	public void voidExecute() throws IllegalArgumentException, IOException {
		resourceView.printOrder(resource, topbox, childseat, max, name);

	}

	@Override
	public int intExecute() throws IllegalArgumentException, IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String stringExecute() throws IllegalArgumentException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
