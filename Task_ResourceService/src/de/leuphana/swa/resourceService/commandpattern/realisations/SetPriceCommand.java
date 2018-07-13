package de.leuphana.swa.resourceService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.resourceService.commandpattern.ResourceCommand;
import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.TopBox;
import de.leuphana.swa.resourceService.resource.Resource;
import de.leuphana.swa.resourceService.view.ResourceView;

public class SetPriceCommand implements ResourceCommand {

	private ResourceView resourceView;
	private Resource resource;
	private TopBox topBox;
	private ChildSeat childSeat;
	private float resourcePrice;
	private float topBoxPrice;
	private float childSeatPrice;

	public SetPriceCommand(final ResourceView resourceView, Resource resource, TopBox topbox, ChildSeat childSeat, float resourcePrice, float topBoxPrice, float childSeatPrice) {
		this.resourceView = resourceView;
		
		this.resource = resource;
		this.topBox = topbox;
		this.childSeat = childSeat;
		
		this.resourcePrice = resourcePrice;
		this.topBoxPrice = topBoxPrice;
		this.childSeatPrice = childSeatPrice;
	}
	
	@Override
	public void voidExecute() throws IllegalArgumentException, IOException {
		resourceView.setResourcePrice(resource, topBox, childSeat, resourcePrice, topBoxPrice, childSeatPrice);
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
