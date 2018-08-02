package test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import controller.BookingServiceController;
import model.LanguageType;

class BookingServiceTest {
LanguageType language = LanguageType.GERMAN;
String name = "Max Mustermann";
BigDecimal cost = new BigDecimal("100");
	@Test
	void test() {
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingServiceController.bookingCommand(language, name, cost);
	}

}
