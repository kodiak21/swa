package controller;

import java.math.BigDecimal;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;

import model.resource.Resource;

public class SetResourcePriceAction implements ResourceServiceAction {

	ResourceService resourceService = new ResourceService();
	
	Resource resource;
	TopBox topBox;
	ChildSeat childSeat;
	
	BigDecimal resourcePrice;
	BigDecimal topBoxPrice;
	BigDecimal childSeatPrice;

	public SetResourcePriceAction(Resource resource, TopBox topBox, ChildSeat childSeat, BigDecimal resourcePrice, BigDecimal topBoxPrice, BigDecimal childSeatPrice) {
		this.resource = resource ;
		this.topBox = topBox;
		this.childSeat = childSeat;
		
		this.resourcePrice = resourcePrice;
		this.topBoxPrice = topBoxPrice;
		this.childSeatPrice = childSeatPrice;
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox, ChildSeat childSeat, LanguageType languageType, int numberTopBox,int numberChild) {
		
		resource.setPrice(resourcePrice);
		if(topBox!=null) {
			topBox.setPrice(topBoxPrice);
		}
		childSeat.setPrice(childSeatPrice);
		
		return resourceService;
	}

}
