package swa;

import java.io.IOException;


import controller.AuthentificationServiceController;
import controller.BookingServiceController;
import controller.OrganisationServiceController;
import controller.PaymentServiceController;
import controller.PersonServiceController;
import controller.ResourceServiceController;
import controller.StatisticServiceController;
import model.AuthentificationService;
import model.BookingService;
import model.OrganisationService;
import model.PaymentService;
import model.PersonService;
import model.ResourceService;
import model.StatisticService;

/**<b> Service</b>: CarReservationService<br>
 * 
 * <br><b>CarReservationServiceController:</b> Controller, der alle ServiceController der einzelen TeilServices verwaltet.
 *Jeder einzelne Service ist im MVC-Muster realisiert.<br>
 *Es wurden für das MVC-Muster die Architekturmuster Observer und Command verwendet<br>
 *
 * <br><b>verwaltete Services:</b> Services werden in den einzelnen Klassen erläutert und seperat getestet, angegeben sind die jeweils realisierten Architekturmuster.<br>
 *
 *
 * <br> - PersonService - Method Factory
 * <br> - OrganisationService - Composite
 * <br> - ResourceService - Decorator
 * <br> - AuthentificationService - Strategy
 * <br> - BookingService - Builder
 * <br> - PaymentService - Template
 * <br> - StatisticService - Visitor
 *
 */

public class CarReservationController {

	public void action() throws IllegalArgumentException, IOException {
		
		PersonService 			personService;
		OrganisationService		organisationService;
		AuthentificationService authentificationService;
		BookingService 			bookingService;
		PaymentService 			paymentService;
		ResourceService 		resourceService;
		StatisticService		statisticService;
		
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
	
//Authentification erstellen und durchfuehren bekommt 	<- User
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
		StatisticServiceController statisticServiceController = new StatisticServiceController();
		statisticService = statisticServiceController.statisticCommand(paymentService.getPayments(), personService.getPerson().getLanguageType());
//Print Statistics
		
	}
}
