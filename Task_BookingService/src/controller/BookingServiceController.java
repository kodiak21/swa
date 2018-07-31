package controller;

import java.math.BigDecimal;

import model.BookingService;
import model.LanguageType;
import model.ResourceService;
import model.resource.Car;

public class BookingServiceController {
	public BookingService bookingCommand(LanguageType language, String name) {
		
		BookingService bookingService = new BookingService();
		ResourceService resourceService = new ResourceService();
		
//		TODO HardCoded--------------
		Car car = new Car();
		BigDecimal carPrice = BigDecimal.valueOf(5000);
		car.setCarPrice(carPrice);
//		----------------------------
		
		CreateBookingAction createBookingAction = new CreateBookingAction(car, language, name);
		bookingService = createBookingAction.action(bookingService);
		
		PrintBookingAction printBookingAction = new PrintBookingAction();
		bookingService = printBookingAction.action(bookingService);
		
		DeleteBookingAction deleteBookingAction = new DeleteBookingAction();
		bookingService = deleteBookingAction.action(bookingService);
		
		return bookingService;
	}

}
