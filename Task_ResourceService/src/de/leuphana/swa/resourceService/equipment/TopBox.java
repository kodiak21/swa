package de.leuphana.swa.resourceService.equipment;

import de.leuphana.swa.resourceService.resource.Resource;

public class TopBox extends Equipment {

	private float topBoxPrice;
	
	public TopBox(Resource resource) {
		super(resource);
	}

	public float getPrice() {
		return topBoxPrice;
	}

	@Override
	public void getSelectedResource() {

		System.out.println(" additional TopBox is ordered !");
		
	}

	@Override
	public void setPrice(float price) {
		topBoxPrice = price;
		
	}

}
