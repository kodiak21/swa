package de.leuphana.swa.resourceService.equipment;

import de.leuphana.swa.resourceService.resource.Resource;

public class Car implements Resource {

	public double getPrice() {
		return 400.0;
	}

	@Override
	public void getSelectedResource() {
		System.out.println(" Car is ordered !");	
	}

}
