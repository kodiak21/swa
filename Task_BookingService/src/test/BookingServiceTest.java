package test;

import org.junit.jupiter.api.Test;

import controller.BookingServiceController;
import model.LanguageType;
import model.resource.Resource;

class BookingServiceTest {
LanguageType language = LanguageType.GERMAN;
String name = "Max Mustermann";
Resource car;
	@Test
	void test() {
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingServiceController.bookingCommand(language, name, car);
	}

}
