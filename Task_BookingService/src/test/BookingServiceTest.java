package test;

import org.junit.jupiter.api.Test;

import controller.BookingServiceController;
import model.LanguageType;

class BookingServiceTest {
LanguageType language = LanguageType.GERMAN;
	@Test
	void test() {
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingServiceController.bookingCommand(language);
	}

}
