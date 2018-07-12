package de.leuphana.swa.resourceService.resource;

public class Car implements Resource {
	
	private float carPrice;

	@Override
	public void setPrice(float price) {
		carPrice = price;
	}
	
	public float getPrice() {
		return carPrice;
	}

	@Override
	public void getSelectedResource() {
		System.out.println("Ordered: Car");	
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	
}
