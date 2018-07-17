package swa;

import java.io.IOException;

import controller.AuthentificationServiceController;
import controller.BookingServiceController;
import controller.OrganisationServiceController;
import controller.PaymentServiceController;
import controller.PersonServiceController;
import controller.ResourceServiceController;
import model.AuthentificationService;
import model.BookingService;
import model.LanguageType;
import model.OrganisationService;
import model.PaymentService;
import model.PersonService;
import model.ResourceService;

public class CarReservationController {
	private LanguageType languageType;

	public void action() throws IllegalArgumentException, IOException {
		
//		String[] args = null;
		
		PersonService 			personService;
		OrganisationService		organisationService;
		AuthentificationService authentificationService;
		BookingService 			bookingService;
		PaymentService 			paymentService;
		ResourceService 		resourceService;
		
//Person erstellen		
		PersonServiceController personServiceController = new PersonServiceController();
		personService = personServiceController.personCommand();
//Uebergibt 											-> personService
				
//Organisation erstellen (Als User nur einteilung in gruppe. Als Admin erstellung/ver�nderung der Gruppenstruktur)
		OrganisationServiceController organisationServiceController = new OrganisationServiceController();
		organisationService = organisationServiceController.organisationCommand(personService.getPerson());
//Uebergibt												-organisationService
				
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
