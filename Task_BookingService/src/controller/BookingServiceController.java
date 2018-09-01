package controller;

import java.math.BigDecimal;

import model.BookingService;
import model.CarBrandType;
import model.LanguageType;

/**<b> Übergeordneter Service</b>: BookingService<br>
 * 
 * <br><b>BookingServiceController:</b> Controller, der alle BookingService bezogenen Actions verwaltet<br> 
 * 
 * <br><b>verwaltete Aktionen:</b> Funktionen werden in den einzelnen Klassen erläutert<br>
 * 
 * <br> - CreateBookingAction
 * <br> - PrintBookingAction
 * <br> - DeleteBookingAction
 * <br> - FareWellBookingAction
 */

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
