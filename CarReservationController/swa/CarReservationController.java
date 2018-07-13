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
		
		//Person und Organisation verknüpfen
		
		//Authentification erstellen
		
		//Authentification durchführen
		
		//Booking erstellen
		BookingService bookingService;
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingService = bookingServiceController.bookingCommand();
		
		//Payment durchführen
		Payment payment;
		PaymentServiceController psc = new PaymentServiceController();
		payment = psc.paymentCommand();
		
		//Statistic erstellen
		
	}
}
