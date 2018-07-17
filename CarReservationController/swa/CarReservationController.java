package swa;

import controller.AuthentificationServiceController;
import controller.BookingServiceController;
import controller.OrganisationServiceController;
import controller.PaymentServiceController;
import controller.PersonServiceController;
import model.AuthentificationService;
import model.BookingService;
import model.OrganisationService;
import model.PaymentService;
import model.PersonService;

public class CarReservationController {
	public void action() {
		
//		String[] args = null;
		
		PersonService 			personService;
		OrganisationService		organisationService;
		AuthentificationService authentificationService;
		BookingService 			bookingService;
		PaymentService 			paymentService;
		
//Person erstellen		
		PersonServiceController personServiceController = new PersonServiceController();
		personService = personServiceController.personCommand();
//Uebergibt 											-> personService
				
//Organisation erstellen (Als User nur einteilung in gruppe. Als Admin erstellung/veränderung der Gruppenstruktur)
		OrganisationServiceController organisationServiceController = new OrganisationServiceController();
		organisationService = organisationServiceController.organisationCommand(personService.getPerson());
//Uebergibt												-organisationService
				
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
////resource mï¿½sste ï¿½bergeben werden (Preis, Bestandteile)
	
//Authentification erstellen udn durchfuehren bekommt 	<- User
		AuthentificationServiceController authentificationServiceController = new AuthentificationServiceController();
		authentificationService = authentificationServiceController.authentificationCommand(personService.getPerson());
//Uebergibt 											-> authentificationService
		
//Booking erstellen <- Bekommt Resource, LanguageType
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingService = bookingServiceController.bookingCommand(personService.getPerson().getLanguage(), personService.getPerson().getName());
//Uebergibt 											-> BookingService
		
//Payment durchfuehren <- bekommt BookingService
		PaymentServiceController psc = new PaymentServiceController();
		paymentService = psc.paymentCommand(bookingService);
//Ubergibt 												-> paymentService
		
//Statistic erstellen <- Sucht sich Daten
//Print Statistics
		
	}
}
