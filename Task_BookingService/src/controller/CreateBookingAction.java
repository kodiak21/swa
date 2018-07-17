package controller;

import de.leuphana.swa.resourceService.resource.Car;
import model.BookingService;
import model.LanguageType;

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
