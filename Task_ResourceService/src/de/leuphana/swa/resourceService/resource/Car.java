package de.leuphana.swa.resourceService.resource;

public class Car implements Resource {
	
	private double carPrice;

	@Override
	public void setPrice(double price) {
		carPrice = price;
	}
	
	public double getPrice() {
		return carPrice;
	}

	@Override
	public void getSelectedResource() {
		System.out.println("Ordered: Car");	
	}
}
