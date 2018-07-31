package controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;
import view.PrintMenuView;
import view.PrintOrderView;

public class PrintOrderResourceAction implements ResourceServiceAction {

	PrintOrderView printOrderView;
	
	LanguageType languageType;
	
	int numberChildSeats;
	int numberTopBox;
	String carName;

	private Resource resource;
	private TopBox topBox;
	private ChildSeat childSeat;

	public PrintOrderResourceAction(int numberTopBox, Resource resource, TopBox topBox, ChildSeat childSeat, String carName) {
		this.printOrderView = new PrintOrderView();
		this.carName = carName;
		this.resource = resource;
		this.topBox = topBox;
		this.childSeat = childSeat;
	}

	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {
		
		if (languageType == LanguageType.GERMAN) {
			
			if (resourceService.getChildSeatResource() != null) {
				
				BigDecimal childSeatPrice = resourceService.getChildSeatResource().getPrice();
				
				BigDecimal amount = new BigDecimal(resourceService.getChildSeatQuantity());

				BigDecimal total = resourceService.calculateChildSeatPrice(childSeatPrice, amount);
				
				numberChildSeats = resourceService.getChildSeatQuantity();
				
				BigDecimal totalPrice = resourceService.calculateOrderPrice(resourceService.getCarResource(), resourceService.getTopBoxResource(), total);
				
				resourceService.setOrderPrice(totalPrice);
				
				printOrderView.showGer(resourceService.getCarResource(), resourceService.getTopBoxResource(), resourceService.getChildSeatResource(), total, numberTopBox, numberChildSeats, resourceService.getCarName());

			} else if (resourceService.getChildSeatResource() == null) {
				BigDecimal total = BigDecimal.ZERO;

				BigDecimal totalPrice = resourceService.calculateOrderPrice(resourceService.getCarResource(), resourceService.getTopBoxResource(), total);
				
				resourceService.setOrderPrice(totalPrice);
				
				printOrderView.showGer(resourceService.getCarResource(), resourceService.getTopBoxResource(), resourceService.getChildSeatResource(), total, numberTopBox, numberChildSeats, resourceService.getCarName());

			}
	
		} else if (languageType == LanguageType.ENGLISH) {

			if (childSeat != null) {
				
				BigDecimal childSeatPrice = resourceService.getChildSeatResource().getPrice();
				
				BigDecimal amount = new BigDecimal(resourceService.getChildSeatQuantity());

				BigDecimal total = resourceService.calculateChildSeatPrice(childSeatPrice, amount);
				
				numberChildSeats = resourceService.getChildSeatQuantity();
				
				BigDecimal totalPrice = resourceService.calculateOrderPrice(resourceService.getCarResource(), resourceService.getTopBoxResource(),total);

				resourceService.setOrderPrice(totalPrice);
				
				printOrderView.showEng(resourceService.getCarResource(), resourceService.getTopBoxResource(), resourceService.getChildSeatResource(), total, numberTopBox, numberChildSeats, resourceService.getCarName());
			}else if (childSeat == null) {
				BigDecimal total = BigDecimal.ZERO;
				
				BigDecimal totalPrice = resourceService.calculateOrderPrice(resourceService.getCarResource(), resourceService.getTopBoxResource(),total);

				resourceService.setOrderPrice(totalPrice);

				printOrderView.showEng(resourceService.getCarResource(), resourceService.getTopBoxResource(), resourceService.getChildSeatResource(), total, numberTopBox, numberChildSeats, resourceService.getCarName());

			}
		}

		return resourceService;
	}

	
}
