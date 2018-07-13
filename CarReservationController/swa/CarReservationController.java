package swa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import controller.BookingServiceController;
import controller.PaymentServiceController;
import de.leuphana.swa.organisationService.commandpattern.OrganisationCommandController;
import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.commandpattern.PersonalCommandController;
import de.leuphana.swa.authentificationService.commandpattern.AuthentificationCommandController;
import de.leuphana.swa.organisationService.*;
import de.leuphana.swa.resourceService.commandpattern.ResourceCommandController;
import de.leuphana.swa.resourceService.resource.Resource;
import model.BookingService;
import model.PaymentService;

public class CarReservationController {
	public void action() {
		
		String[] args = null;
		
		
		Person person;
		User user;
		List<User> users = new ArrayList<User>();
		Resource car;
		boolean authentificated;
		BookingService bookingService;
		PaymentService paymentService;
		
//Person erstellen		
		try {
			PersonalCommandController.main(args);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//Hier m�sste ein PersonService �bergeben werden (Sprache inklusive)
		
		
//Organisation erstellen (Vielleicht nur als Admin verf�gbar, Organisationstruktur vorher Hard coden???)

		try {
			OrganisationCommandController.main(args);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//Hier m�sste eine List<User> �bergeben werden
		
		
//Person und Organisation verkn�pfen
		//M�sste schon bei organisation passieren.
//Hier m�sste ein User �bergeben werden
		
		
//resource erstellen
		try {
			ResourceCommandController.main(args);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//resource m�sste �bergeben werden (Preis, Bestandteile)

		
//Authentification erstellen <-bekommt User
		try {
			AuthentificationCommandController.main(args);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//Authentification wird �bergeben

		
//Authentification durchf�hren <-bekommt Authentification, User
//�bergibt boolean;

		
//Booking erstellen <- Bekommt Resource, User
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingService = bookingServiceController.bookingCommand();
//�bergibt Booking;
		
//Payment durchf�hren <. bekommt Booking
		PaymentServiceController psc = new PaymentServiceController();
		paymentService = psc.paymentCommand(bookingService);
//�bergibt paymentService;
		
//Statistic erstellen <- Sucht sich Daten
//Print Statistics
		
	}
}
