package test;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import swa.CarReservationController;

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
