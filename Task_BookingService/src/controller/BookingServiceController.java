package controller;

import de.leuphana.swa.resourceService.resource.Car;
import model.BookingService;
import model.LanguageType;

public class BookingServiceController {
	public BookingService bookingCommand(LanguageType language) {
		
		BookingService bookingService = new BookingService();
		
//		TODO HardCoded--------------
		Car car = new Car();
		car.setCarPrice(5000);
//		----------------------------
		
		CreateBookingAction createBookingAction = new CreateBookingAction(car, language);
		bookingService = createBookingAction.action(bookingService);
		
		PrintBookingAction printBookingAction = new PrintBookingAction();
		bookingService = printBookingAction.action(bookingService);
		
		DeleteBookingAction deleteBookingAction = new DeleteBookingAction();
		bookingService = deleteBookingAction.action(bookingService);
		
		return bookingService;
	}

}
