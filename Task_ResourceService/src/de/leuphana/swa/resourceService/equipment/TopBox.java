package de.leuphana.swa.resourceService.equipment;

import de.leuphana.swa.resourceService.resource.Resource;

public class TopBox extends Equipment {

	private double topBoxPrice;
	
	public TopBox(Resource resource) {
		super(resource);
	}

	public double getPrice() {
		return topBoxPrice;
	}

	@Override
	public void getSelectedResource() {

		System.out.println(" additional TopBox is ordered !");
		
	}

	@Override
	public void setPrice(double price) {
		topBoxPrice = price;
		
	}

}
