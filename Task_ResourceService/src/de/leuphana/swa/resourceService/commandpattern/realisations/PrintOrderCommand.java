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
	private TopBox topBox;
	private ChildSeat childSeat;
	private int max;
	private String name;

	private double childSeatPrice;

	public PrintOrderCommand(final ResourceView resourceView, Resource resource, TopBox topbox, ChildSeat childSeat, double childSeatPrice, int max, String name) {
		this.resourceView = resourceView;
		this.resource = resource;
		this.topBox = topbox;
		this.childSeat = childSeat;
		
		this.childSeatPrice = childSeatPrice;
 		
		this.max = max;
		this.name = name;
	}
	
	@Override
	public void voidExecute() throws IllegalArgumentException, IOException {
		resourceView.printOrder(resource, topBox, childSeat, childSeatPrice, max, name);

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
