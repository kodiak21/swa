package controller;

import java.math.BigDecimal;

import model.BookingService;
import model.CarBrandType;
import model.LanguageType;

public class BookingServiceController {
	public BookingService bookingCommand(LanguageType language, String name, BigDecimal price, CarBrandType carBrandType) {
		
		BookingService bookingService = new BookingService();
				
		CreateBookingAction createBookingAction = new CreateBookingAction(price, language, name, carBrandType);
		bookingService = createBookingAction.action(bookingService);
		
		PrintBookingAction printBookingAction = new PrintBookingAction();
		bookingService = printBookingAction.action(bookingService);
		
		DeleteBookingAction deleteBookingAction = new DeleteBookingAction();
		bookingService = deleteBookingAction.action(bookingService);
		
		if(bookingService.getDeleteAnswer()==2) {
			FareWellBookingAction fareWellBookingAction = new FareWellBookingAction();
			bookingService = fareWellBookingAction.action(bookingService);
		}
		
		return bookingService;
	}

}
