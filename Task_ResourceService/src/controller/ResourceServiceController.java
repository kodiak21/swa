package controller;

import java.io.IOException;
import java.math.BigDecimal;

import model.BookingService;
import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class ResourceServiceController {
	TopBox topBox;
	ChildSeat childSeat;
	Resource resource;
	
	int numberChildSeats;
	int numberTopBox;
	String carName;
	
	BigDecimal topBoxPrice;
	BigDecimal childSeatPrice;
	BigDecimal resourcePrice;
	BookingService bookingService;

	public ResourceService resourcePlanning(LanguageType languageType) throws IllegalArgumentException, IOException {
		
		ResourceService resourceService = new ResourceService();
		
		AskCarOrderAction  askCarOrderAction = new AskCarOrderAction();
		resourceService = askCarOrderAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		AskCarBrandAction  askCarBrandAction = new AskCarBrandAction();
		resourceService = askCarBrandAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		AskTopBoxOrderAction askTopBoxOrderAction = new AskTopBoxOrderAction();
		resourceService = askTopBoxOrderAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		AskNumberTopBoxAction askNumberTopBoxAction = new AskNumberTopBoxAction();
		resourceService = askNumberTopBoxAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		AskChildSeatOrderAction askChildSeatOrderAction = new AskChildSeatOrderAction();
		resourceService = askChildSeatOrderAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		AskNumberChildSeatAction askNumberChildSeatAction = new AskNumberChildSeatAction();
		resourceService = askNumberChildSeatAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		AskDeleteResourceAction askDeleteResourceAction = new AskDeleteResourceAction();
		resourceService = askDeleteResourceAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		PrintMenuResourceAction printMenuResourceAction = new PrintMenuResourceAction();
		resourceService = printMenuResourceAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		PrintOrderResourceAction printOrderResourceAction = new PrintOrderResourceAction(numberChildSeats, numberChildSeats, carName);
		resourceService = printOrderResourceAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		SetResourcePriceAction SetResourcePriceAction  = new SetResourcePriceAction(resource, topBox, childSeat, resourcePrice, topBoxPrice, childSeatPrice);
		resourceService = SetResourcePriceAction.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox, numberChildSeats);
		
		return resourceService;
	}

	public BookingService bookingCommand(LanguageType languageType) {
		// TODO Auto-generated method stub
		return bookingService;
	}

}
