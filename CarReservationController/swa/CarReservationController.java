package swa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import controller.AuthentificationServiceController;
import controller.BookingServiceController;
import controller.ResourceServiceController;
import controller.PaymentServiceController;
import controller.PersonServiceController;
import de.leuphana.swa.authentificationService.commandpattern.AuthentificationCommandController;
import de.leuphana.swa.organisationService.commandpattern.OrganisationCommandController;
import de.leuphana.swa.resourceService.commandpattern.ResourceCommandController;
import model.AuthentificationService;
import model.BookingService;
import model.LanguageType;
import model.PaymentService;
import model.PersonService;
import model.ResourceService;
import model.User;
import model.resource.Resource;

public class CarReservationController {
	public void action() throws IllegalArgumentException, IOException {
		
		String[] args = null;
		
		
		PersonService personService = new PersonService();
		User user;
		List<User> users = new ArrayList<User>();
		Resource car;
		boolean authentificated;
		AuthentificationService authentificationService;
		BookingService bookingService;
		PaymentService paymentService;
		ResourceService resourceService;
		LanguageType languageType = LanguageType.GERMAN;
		
//Person erstellen		
		PersonServiceController personServiceController = new PersonServiceController();
		personService = personServiceController.personCommand();
//Hier m�sste ein PersonService �bergeben werden (Sprache inklusive)
		
		
////Organisation erstellen (Vielleicht nur als Admin verf�gbar, Organisationstruktur vorher Hard coden???)
//
//		try {
//			OrganisationCommandController.main(args);
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////Hier m�sste eine List<User> �bergeben werden
//		
//		
////Person und Organisation verkn�pfen
//		//M�sste schon bei organisation passieren.
////Hier m�sste ein User �bergeben werden
//		
////resource erstellen
		ResourceServiceController resourceServiceController = new ResourceServiceController();
		resourceService = resourceServiceController.resourcePlanning(languageType);
//		try {
//			ResourceCommandController.main(args);
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////resource m�sste �bergeben werden (Preis, Bestandteile)
//
//		
//Authentification erstellen <-bekommt User
		AuthentificationServiceController authentificationServiceController = new AuthentificationServiceController();
		authentificationService = authentificationServiceController.authentificationCommand();
//		try {
//			AuthentificationCommandController.main(args);
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//Authentification wird �bergeben
//
//		
////Authentification durchf�hren <-bekommt Authentification, User
////�bergibt boolean;

		
//Booking erstellen <- Bekommt Resource, User
		languageType = personService.getPerson().getLanguage();
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingService = bookingServiceController.bookingCommand(languageType);
//�bergibt Booking;
		
//Payment durchf�hren <. bekommt Booking
		PaymentServiceController psc = new PaymentServiceController();
		paymentService = psc.paymentCommand(bookingService);
//�bergibt paymentService;
		
//Statistic erstellen <- Sucht sich Daten
//Print Statistics
		
	}
}
