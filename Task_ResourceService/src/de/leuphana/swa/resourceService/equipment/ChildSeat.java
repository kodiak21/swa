package de.leuphana.swa.resourceService.equipment;

import de.leuphana.swa.resourceService.resource.Resource;

public class ChildSeat extends Equipment {

	private double childSeatPrice;
	
	public ChildSeat(Resource resource) {
		super(resource);
	}

	public double getPrice() {
		return childSeatPrice;
	}

	public void getSelectedResource() {

		System.out.println(" additional Childseat is ordered !");

	}

	@Override
	public void setPrice(double price) {
		childSeatPrice = price;
		
	}

}
