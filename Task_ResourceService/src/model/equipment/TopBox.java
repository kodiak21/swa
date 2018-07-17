package model.equipment;

import java.math.BigDecimal;

import model.resource.Resource;

public class TopBox extends Equipment {

	private BigDecimal topBoxPrice;
	
	public TopBox(Resource resource) {
		super(resource);
	}

	public BigDecimal getPrice() {
		return topBoxPrice;
	}

	@Override
	public void getSelectedResourceGer(Resource resource, int childSeats) {

		System.out.println("1 Dachgepaecktraeger bestellt !");
		
	}
	
	@Override
	public void getSelectedResourceEng(Resource resource, int childSeats) {

		System.out.println("1 TopBox ordered !");
		
	}

	@Override
	public void setPrice(BigDecimal price) {
		topBoxPrice = price;
		
	}

	@Override
	public String toString(Resource resource) {
		// TODO Auto-generated method stub
		return null;
	}

}
