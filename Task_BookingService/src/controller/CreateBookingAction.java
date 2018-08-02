package controller;

import java.math.BigDecimal;

import model.BookingService;
import model.LanguageType;

public class CreateBookingAction implements BookingServiceAction{
	
	BigDecimal price;
	LanguageType language;
	String name;
	
	public CreateBookingAction(BigDecimal price, LanguageType language, String name) {
		this.language = language;
		this.price = price;
		this.name = name;
	}
	
	@Override
	public BookingService action(BookingService bookingService) {

		bookingService.createBooking(price, language, name);

		return bookingService;
	}
	
	
}
