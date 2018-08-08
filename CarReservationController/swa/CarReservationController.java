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
import model.OrganisationService;
import model.PaymentService;
import model.PersonService;
import model.ResourceService;

public class CarReservationController {

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
				
//Organisation erstellen (Als User nur automatische Einteilung in Gruppe. Als Admin erstellung/veraenderung der Gruppenstruktur)
		OrganisationServiceController organisationServiceController = new OrganisationServiceController();
		organisationService = organisationServiceController.organisationCommand(personService.getPerson());
//Uebergibt												-> organisationService
				
//Resource erstellen 									<- LanguageType
		ResourceServiceController resourceServiceController = new ResourceServiceController();
		resourceService = resourceServiceController.resourcePlanning(personService.getPerson().getLanguageType());
//Uebergibt												-> resourceService
	
//Authentification erstellen udn durchfuehren bekommt 	<- User
		AuthentificationServiceController authentificationServiceController = new AuthentificationServiceController();
		authentificationService = authentificationServiceController.authentificationCommand(personService.getPerson());
//Uebergibt 											-> authentificationService
		
//Booking erstellen 									<- Bekommt Price, LanguageType, Name
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingService = bookingServiceController.bookingCommand(personService.getPerson().getLanguageType(), personService.getPerson().getName(), resourceService.getOrderPrice(), resourceService.getCarBrand());
//Uebergibt 											-> BookingService
		
//Payment durchfuehren 									<- bekommt currencyAmount, senderAccount
		PaymentServiceController psc = new PaymentServiceController();
		paymentService = psc.paymentCommand(bookingService.getCost(), organisationService.getUser().getAccount(), personService.getPerson().getLanguageType());
//Ubergibt 												-> paymentService
		
//Statistic erstellen <- Sucht sich Daten

//Print Statistics
		
	}
}
