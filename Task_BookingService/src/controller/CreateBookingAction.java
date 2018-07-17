package controller;

import model.BookingService;
import model.LanguageType;
import model.resource.Car;
import views.QuestionLanguageView;

public class CreateBookingAction implements BookingServiceAction{
	
	Car car;
	LanguageType language;
	
	public CreateBookingAction(Car car, LanguageType language) {
		this.language = language;
		this.car = car;
	}
	
	@Override
	public BookingService action(BookingService bookingService) {

		bookingService.createBooking(car, language);

		return bookingService;
	}
	
	
}
