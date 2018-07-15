package swa;

import java.util.ArrayList;
import java.util.List;

import controller.BookingServiceController;
import controller.PaymentServiceController;
import controller.PersonServiceController;
import de.leuphana.swa.resourceService.resource.Resource;
import model.BookingService;
import model.LanguageType;
import model.PaymentService;
import model.PersonService;
import model.User;

public class CarReservationController {
	public void action() {
		
		String[] args = null;
		
		PersonService personService = new PersonService();
		User user;
		List<User> users = new ArrayList<User>();
		Resource car;
		boolean authentificated;
		BookingService bookingService;
		PaymentService paymentService;
		LanguageType language;
		
//Person erstellen		
		PersonServiceController personServiceController = new PersonServiceController();
		personService = personServiceController.personCommand();
//Hier müsste ein PersonService übergeben werden (Sprache inklusive)
		
		
////Organisation erstellen (Vielleicht nur als Admin verfügbar, Organisationstruktur vorher Hard coden???)
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
////Hier müsste eine List<User> übergeben werden
//		
//		
////Person und Organisation verknüpfen
//		//Müsste schon bei organisation passieren.
////Hier müsste ein User übergeben werden
//		
//		
////resource erstellen
//		try {
//			ResourceCommandController.main(args);
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////resource müsste übergeben werden (Preis, Bestandteile)
//
//		
////Authentification erstellen <-bekommt User
//		try {
//			AuthentificationCommandController.main(args);
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////Authentification wird übergeben
//
//		
////Authentification durchführen <-bekommt Authentification, User
////Übergibt boolean;

		
//Booking erstellen <- Bekommt Resource, User
		language = personService.getPerson().getLanguage();
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingService = bookingServiceController.bookingCommand(language);
//Übergibt Booking;
		
//Payment durchführen <. bekommt Booking
		PaymentServiceController psc = new PaymentServiceController();
		paymentService = psc.paymentCommand(bookingService);
//Übergibt paymentService;
		
//Statistic erstellen <- Sucht sich Daten
//Print Statistics
		
	}
}
