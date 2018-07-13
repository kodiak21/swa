package controller;

import de.leuphana.swa.resourceService.resource.Car;
import model.BookingService;

public class BookingServiceController {
	public BookingService bookingCommand() {
		
		BookingService bookingService = new BookingService();
		
//		TODO HardCoded--------------
		Car car = new Car();
		car.setCarPrice(5000);
//		----------------------------
		
		CreateBookingAction createBookingAction = new CreateBookingAction(car);
		bookingService = createBookingAction.action(bookingService);
		
		PrintBookingAction printBookingAction = new PrintBookingAction();
		bookingService = printBookingAction.action(bookingService);
		
		DeleteBookingAction deleteBookingAction = new DeleteBookingAction();
		bookingService = deleteBookingAction.action(bookingService);
		
		return bookingService;
	}

}
