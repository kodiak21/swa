package model;

import java.math.BigDecimal;

import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;

public class ResourceService {

	private Resource carResource = null;
	private TopBox topBoxResource = null;
	private ChildSeat childSeatResource = null;

	private String carName;

	private int confirmAnswer;
	private int carResourceAnswer;
	private int topBoxResourceAnswer;
	private int topBoxQuantity;
	private int childSeatResourceAnswer;
	private int childSeatQuantity;
	
	private BigDecimal orderPrice;

	public Resource createCarResource() {
		
		if(getCarResourceAnswer()==1) {
			carResource = new Car();
		}else if(getCarResourceAnswer()==2) {
			carResource = null;
		}
		
		return carResource;
	}

	public TopBox createTopBoxResource() {
		
		if(getCarResourceAnswer() == 1 && getTopBoxResourceAnswer()==1) {
			carResource = new Car();
			topBoxResource = new TopBox(carResource);
		}else if(getCarResourceAnswer()==2 && getTopBoxResourceAnswer()==2) {
			carResource = null;
			topBoxResource = null;
		}
		
		return topBoxResource;
	}

	public ChildSeat createChildSeatResource() {
		if (getTopBoxResourceAnswer() == 1 && getChildSeatResourceAnswer() == 1) {
			carResource = new Car();
			childSeatResource = new ChildSeat(new TopBox(topBoxResource));
		} else if (getTopBoxResourceAnswer() == 2 && getChildSeatResourceAnswer() == 1) {
			carResource = new Car();
			childSeatResource = new ChildSeat(carResource);
			setTopBoxResource(null);
		}

		return childSeatResource;
	}

	public void deleteResource() {
		if (getConfirmAnswer() == 2) {
			setCarResource(null);
			setTopBoxResource(null);
			setChildSeatResource(null);
		}
	}

	public void setConfirmAnswer(int confirmAnswer) {
		this.confirmAnswer = confirmAnswer;

	}

	public int getConfirmAnswer() {
		return confirmAnswer;
	}

	public void setCarResourceAnswer(int carResourceAnswer) {
		this.carResourceAnswer = carResourceAnswer;
	}

	public int getCarResourceAnswer() {
		return carResourceAnswer;
	}

	public void setTopBoxResourceAnswer(int topBoxResourceAnswer) {
		this.topBoxResourceAnswer = topBoxResourceAnswer;
	}

	public int getTopBoxResourceAnswer() {
		return topBoxResourceAnswer;
	}

	public void setTopBoxQuantity(int topBoxQuantity) {
		this.topBoxQuantity = topBoxQuantity;
	}

	public int getTopBoxQuantity() {
		return topBoxQuantity;
	}

	public void setChildSeatResourceAnswer(int childSeatResourceAnswer) {
		this.childSeatResourceAnswer = childSeatResourceAnswer;
	}

	public int getChildSeatResourceAnswer() {
		return childSeatResourceAnswer;
	}

	public void setChildSeatQuantity(int childSeatQuantity) {
		this.childSeatQuantity = childSeatQuantity;
	}

	public int getChildSeatQuantity() {
		return childSeatQuantity;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public Resource getCarResource() {
		return carResource;
	}

	public TopBox getTopBoxResource() {
		return topBoxResource;
	}

	public ChildSeat getChildSeatResource() {
		return childSeatResource;
	}

	public void setCarResource(Resource carResource) {
		this.carResource = carResource;

	}

	public void setTopBoxResource(TopBox topBoxResource) {
		this.topBoxResource = topBoxResource;

	}

	public void setChildSeatResource(ChildSeat childSeatResource) {
		this.childSeatResource = childSeatResource;

	}
	
	public BigDecimal calculateChildSeatPrice(BigDecimal childSeatPrice, BigDecimal amount) {

		BigDecimal total = childSeatPrice.multiply(amount);

		return total;

	}

	public BigDecimal calculateOrderPrice(Resource carResource, TopBox topBoxResource, BigDecimal total) {
		BigDecimal totalPrice = carResource.getPrice().add(topBoxResource.getPrice()).add(total);
		return totalPrice;
	}

	public void setOrderPrice(BigDecimal totalPrice) {
		this.orderPrice = totalPrice;
		
	}
	
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}


}
