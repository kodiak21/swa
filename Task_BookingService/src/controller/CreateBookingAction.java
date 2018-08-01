package controller;

import model.BookingService;
import model.LanguageType;
import model.resource.Resource;

public class CreateBookingAction implements BookingServiceAction{
	
	Resource car;
	LanguageType language;
	String name;
	
	public CreateBookingAction(Resource car, LanguageType language, String name) {
		this.language = language;
		this.car = car;
		this.name = name;
	}
	
	@Override
	public BookingService action(BookingService bookingService) {

		bookingService.createBooking(car, language, name);

		return bookingService;
	}
	
	
}
