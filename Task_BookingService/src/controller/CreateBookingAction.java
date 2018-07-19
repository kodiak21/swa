package controller;

import model.BookingService;
import model.LanguageType;
import model.resource.Car;

public class CreateBookingAction implements BookingServiceAction{
	
	Car car;
	LanguageType language;
	String name;
	
	public CreateBookingAction(Car car, LanguageType language, String name) {
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
