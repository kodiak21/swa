package de.leuphana.swa.resourceService.equipment;

import de.leuphana.swa.resourceService.resource.Resource;

public class ChildSeat extends Equipment {

	public ChildSeat(Resource resource) {
		super(resource);
	}

	public double getPrice() {
		return resource.getPrice() + 50.0;
	}

	public void getSelectedResource() {
		resource.getSelectedResource();

		System.out.println(" additional Childseat is ordered !");

	}

}
