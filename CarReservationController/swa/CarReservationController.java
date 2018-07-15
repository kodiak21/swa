package swa;

import controller.AuthentificationServiceController;
import controller.BookingServiceController;
import controller.PaymentServiceController;
import controller.PersonServiceController;
import model.AuthentificationService;
import model.BookingService;
import model.LanguageType;
import model.PaymentService;
import model.Person;
import model.PersonService;

public class CarReservationController {
	public void action() {
		
//		String[] args = null;
		
		PersonService 			personService;
		AuthentificationService authentificationService;
		BookingService 			bookingService;
		PaymentService 			paymentService;
		
		Person 					person;
		LanguageType 			languageType;
		
//Person erstellen		
		PersonServiceController personServiceController = new PersonServiceController();
		personService = personServiceController.personCommand();
//Uebergibt 											-> personService
		
		
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
////resource m�sste �bergeben werden (Preis, Bestandteile)
//
//		
//Authentification erstellen udn durchfuehren bekommt 	<- User
		person = personService.getPerson();
		AuthentificationServiceController authentificationServiceController = new AuthentificationServiceController();
		authentificationService = authentificationServiceController.authentificationCommand(person);
//Uebergibt 											-> authentificationService;
		
//Booking erstellen <- Bekommt Resource, LanguageType
		languageType = personService.getPerson().getLanguage();
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingService = bookingServiceController.bookingCommand(languageType);
//Uebergibt 											-> BookingService;
		
//Payment durchfuehren <- bekommt BookingService
		PaymentServiceController psc = new PaymentServiceController();
		paymentService = psc.paymentCommand(bookingService);
//Ubergibt 												-> paymentService;
		
//Statistic erstellen <- Sucht sich Daten
//Print Statistics
		
	}
}
