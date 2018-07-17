package model.equipment;

import java.math.BigDecimal;

import model.resource.Resource;

public class ChildSeat extends Equipment {

	private BigDecimal childSeatPrice;
	
	public ChildSeat(Resource resource) {
		super(resource);
	}

	public BigDecimal getPrice() {
		return childSeatPrice;
	}

	public void getSelectedResourceGer(Resource resource, int childSeats) {
		if(childSeats==1) {
			System.out.println("1 zusaetzlicher Kindersitz wurde bestellt !");
		}else if(childSeats>1) {
			System.out.println(childSeats +" zusaetzliche Kindersitze wurde bestellt !");
		}

	}
	
	public void getSelectedResourceEng(Resource resource, int childSeats) {
		if(childSeats == 1) {
			System.out.println("1 additional childseat has been ordered !");
		}else if(childSeats > 1) {
			System.out.println(childSeats +" additional childseats have been ordered !");
		}
	}

	@Override
	public void setPrice(BigDecimal price) {
		childSeatPrice = price;
		
	}

	@Override
	public String toString(Resource resource) {
		// TODO Auto-generated method stub
		return null;
	}

}
