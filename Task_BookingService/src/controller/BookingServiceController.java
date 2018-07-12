package controller;

import de.leuphana.swa.resourceService.resource.Car;
import model.Booking;
import model.BookingService;

public class BookingServiceController {
	public Booking bookingCommand() {
		
		BookingService bookingService = new BookingService();
		
//		TODO HardCoded--------------
		Car car = new Car();
		car.setCarPrice(500);
//		----------------------------
		
		CreateBookingAction createBookingAction = new CreateBookingAction(car);
		bookingService = createBookingAction.action(bookingService);
		
		PrintBookingAction printBookingAction = new PrintBookingAction();
		bookingService = printBookingAction.action(bookingService);
		
		DeleteBookingAction deleteBookingAction = new DeleteBookingAction();
		bookingService = deleteBookingAction.action(bookingService);
		
		return bookingService.getBooking();
	}

}
