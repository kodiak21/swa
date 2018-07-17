package model.resource;

import java.math.BigDecimal;

public class Car implements Resource {
	
	private BigDecimal carPrice;

	@Override
	public void setPrice(BigDecimal price) {
		carPrice = price;
	}
	
	public BigDecimal getPrice() {
		return carPrice;
	}

	@Override
	public void getSelectedResourceGer(Resource resource, int childSeats) {
		System.out.println("Bestellt: " + resource.toString());	
	}
	
	@Override
	public void getSelectedResourceEng(Resource resource, int childSeats) {
		System.out.println("Ordered: " + resource.toString());	
	}

	public BigDecimal getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(BigDecimal carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString(Resource resource) {
		return resource.toString();
	}
	
	
	
	
}
