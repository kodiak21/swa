package test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import controller.BookingServiceController;
import model.CarBrandType;
import model.LanguageType;

class BookingServiceTest {
LanguageType language = LanguageType.GERMAN;
String name = "Max Mustermann";
BigDecimal cost = new BigDecimal("100");
CarBrandType carBrandType = CarBrandType.BMW;

	@Test
	void test() {
		BookingServiceController bookingServiceController = new BookingServiceController();
		bookingServiceController.bookingCommand(language, name, cost, carBrandType);
	}

}
