package swa;

import controller.BookingServiceController;
import controller.PaymentServiceController;
import model.BookingService;
import model.Payment;

public class CarReservationController {
	public void action() {
		//Person erstellen
		
		//Organisation erstellen
		
		//resource erstellen
		
		//Person und Organisation verkn�pfen
		
		//Authentification erstellen
		
		//Authentification durchf�hren
		
		//Booking erstellen
		BookingService bookingService;
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingService = bookingServiceController.bookingCommand();
		
		//Payment durchf�hren
		Payment payment;
		PaymentServiceController psc = new PaymentServiceController();
		payment = psc.paymentCommand();
		
		//Statistic erstellen
		
	}
}
