package controller;

import java.math.BigDecimal;

import model.BookingService;
import model.LanguageType;

public class BookingServiceController {
	public BookingService bookingCommand(LanguageType language, String name, BigDecimal price) {
		
		BookingService bookingService = new BookingService();
				
		CreateBookingAction createBookingAction = new CreateBookingAction(price, language, name);
		bookingService = createBookingAction.action(bookingService);
		
		PrintBookingAction printBookingAction = new PrintBookingAction();
		bookingService = printBookingAction.action(bookingService);
		
		DeleteBookingAction deleteBookingAction = new DeleteBookingAction();
		bookingService = deleteBookingAction.action(bookingService);
		
		return bookingService;
	}

}
