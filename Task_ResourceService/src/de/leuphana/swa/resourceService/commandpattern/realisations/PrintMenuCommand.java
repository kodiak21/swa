package de.leuphana.swa.resourceService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.resourceService.commandpattern.ResourceCommand;
import de.leuphana.swa.resourceService.view.ResourceView;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class PrintMenuCommand implements ResourceCommand {

	private ResourceView resourceView;

	private Resource resource;
	private TopBox topBox;
	private ChildSeat childSeat;

	private double topBoxPrice;
	private double childSeatPrice;
	private double resourcePrice;

	public PrintMenuCommand(final ResourceView resourceView, Resource resource, TopBox topBox, ChildSeat childSeat, double resourcePrice, double topBoxPrice, double childSeatPrice) {
		this.resourceView = resourceView;
		this.resource = resource;
		this.topBox = topBox;
		this.childSeat = childSeat;
		
		this.resourcePrice = resourcePrice;
		this.topBoxPrice = topBoxPrice;
		this.childSeatPrice = childSeatPrice;
	}

	@Override
	public void voidExecute() {
		resourceView.printMenu(resource, topBox, childSeat, resourcePrice, topBoxPrice, childSeatPrice);
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
