package de.leuphana.swa.resourceService.equipment;

import de.leuphana.swa.resourceService.resource.Resource;

public class ChildSeat extends Equipment {

	private float childSeatPrice;
	
	public ChildSeat(Resource resource) {
		super(resource);
	}

	public float getPrice() {
		return childSeatPrice;
	}

	public void getSelectedResource() {

		System.out.println(" additional Childseat is ordered !");

	}

	@Override
	public void setPrice(float price) {
		childSeatPrice = price;
		
	}

}
