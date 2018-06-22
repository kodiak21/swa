package de.leuphana.swa.resourceService.resource;

public class Car implements Resource {

	public double getPrice() {
		return 400.0;
	}

	@Override
	public void getSelectedResource() {
		System.out.println("Ordered: Car");	
	}

}
