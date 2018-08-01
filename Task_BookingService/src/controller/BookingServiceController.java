package controller;

import model.BookingService;
import model.LanguageType;
import model.resource.Resource;

public class BookingServiceController {
	public BookingService bookingCommand(LanguageType language, String name, Resource car) {
		
		BookingService bookingService = new BookingService();
				
		CreateBookingAction createBookingAction = new CreateBookingAction(car, language, name);
		bookingService = createBookingAction.action(bookingService);
		
		PrintBookingAction printBookingAction = new PrintBookingAction();
		bookingService = printBookingAction.action(bookingService);
		
		DeleteBookingAction deleteBookingAction = new DeleteBookingAction();
		bookingService = deleteBookingAction.action(bookingService);
		
		return bookingService;
	}

}
