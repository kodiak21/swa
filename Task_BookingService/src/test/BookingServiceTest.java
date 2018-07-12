package test;

import org.junit.jupiter.api.Test;

import controller.BookingServiceController;

class BookingServiceTest {

	@Test
	void test() {
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingServiceController.bookingCommand();
	}

}
