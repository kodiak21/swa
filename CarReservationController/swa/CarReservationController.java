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
//Hier müsste ein PersonService übergeben werden (Sprache inklusive)
		
		
//Organisation erstellen (Vielleicht nur als Admin verfügbar, Organisationstruktur vorher Hard coden???)

		try {
			OrganisationCommandController.main(args);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//Hier müsste eine List<User> übergeben werden
		
		
//Person und Organisation verknüpfen
		//Müsste schon bei organisation passieren.
//Hier müsste ein User übergeben werden
		
		
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
//resource müsste übergeben werden (Preis, Bestandteile)

		
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
//Authentification wird übergeben

		
//Authentification durchführen <-bekommt Authentification, User
//Übergibt boolean;

		
//Booking erstellen <- Bekommt Resource, User
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingService = bookingServiceController.bookingCommand();
//Übergibt Booking;
		
//Payment durchführen <. bekommt Booking
		PaymentServiceController psc = new PaymentServiceController();
		paymentService = psc.paymentCommand(bookingService);
//Übergibt paymentService;
		
//Statistic erstellen <- Sucht sich Daten
//Print Statistics
		
	}
}
