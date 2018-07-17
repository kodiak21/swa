package de.leuphana.swa.resourceService.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

class isPriceCorrect {
	
	static Resource childseat;
	
	@BeforeEach
	void setUp() {
		
		childseat = new ChildSeat(new TopBox(childseat));
		childseat.setPrice(570);
		
	}

	@AfterEach
	void tearDown()  {
		
	}

	@Test
	@DisplayName(value = "isPriceCorrect(): Price of car with TopBox and ChildSeat 570")
	void test() {
		assertEquals(570., childseat.getPrice(), 1e-10);
	}

}
