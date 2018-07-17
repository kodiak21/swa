package test;

import org.junit.jupiter.api.Test;

import controller.ResourceServiceController;
import model.LanguageType;

class BookingServiceTest {
LanguageType language = LanguageType.GERMAN;
	@Test
	void test() {
		ResourceServiceController resourceServiceController = new ResourceServiceController();
		resourceServiceController.bookingCommand(language);
	}

}
