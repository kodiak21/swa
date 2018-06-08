package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.SetTopBox;
import de.leuphana.swa.resourceService.resource.Car;
import de.leuphana.swa.resourceService.resource.Resource;

class IsPriceCorrect {

	private Resource resource;

	@BeforeEach
	void setUp() throws Exception {
		resource = new Car();
		resource = new SetTopBox(new ChildSeat(resource));
	}

	@AfterEach
	void tearDown() throws Exception {
		resource = null;
	}

	@Test
	@DisplayName("getPrice(): total price for car with topbox and childseat")
	void test() {
		assertEquals(570., resource.getPrice(), 1e-10);
	}

}
