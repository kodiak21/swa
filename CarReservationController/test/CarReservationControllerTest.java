package test;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import swa.CarReservationController;

/**<b> Übergeordneter Controller</b>: CarReservationController<br>
 * 
 * <br>
 * <b>CarReservationControllerTest:</b> Testet alle wichtigen Commands von CarReservationController<br>
 * 
 *<br><b> getestete Commands:</b><br>
 *
 *<br>- personCommand() - Command PersonService<br>
 *- organisationCommand - Command OrganisationService <br>
 *- resourcePlanning() - Command ResourceService <br>
 *- authentificationCommand() - Command Authentification<br>
 *- bookingCommand() - Command BookingService<br>
 *- paymentCommand() - Command PaymentService<br>
 *- statisticCommand() - Command StatisticService<br>
 *
 * 
 *
 */

public class CarReservationControllerTest {

	private CarReservationController carReservationController;
	
	@BeforeEach
	void setUp() throws Exception {
		carReservationController = new CarReservationController();
	}

	@AfterEach
	void tearDown() throws Exception {
		carReservationController = null;
	}

	@Test
	@DisplayName("action(): test of CarReservationController")
	void testCarReservationController() throws IllegalArgumentException, IOException {
		carReservationController.action();
	}

}
