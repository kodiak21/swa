package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controller.ResourceServiceController;
import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * 
 * <br>
 * <b>ResourceServiceTest:</b> Testet alle wichtigen Funktionen von ResourceService<br>
 * 
 *<br><b> getestete Methoden:</b><br>
 *
 *<br>- createCarResource() - erzeugt Auto Objekt<br>
 *- createTopBoxResource() - erzeugt Dachträger Objekt <br>
 *- createChildSeatResource() - erzeugt Kindersitz Objekt<br>
 *- deleteResource() - löscht Objekte<br>
 *- calculateChildSeatPrice() - berechnet Preis für mehrere Kindersitz Objekte<br>
 *- calculateOrderPrice() - berechnet Preis der Kundenbestellung
 *
 * 
 *
 */
class ResourceServiceTest {

	private Resource carResource;
	private TopBox topBoxResource;
	private ChildSeat childSeatResource;
	
	private BigDecimal carPrice;
	private BigDecimal childSeatPrice;
	
	private BigDecimal totalChildSeatPrice;
	
	private LanguageType languageType;
	
	private ResourceService resourceService;
	private ResourceServiceController resourceServiceController;
	
	@BeforeEach
	void setUp() throws Exception {
		
		carPrice = new BigDecimal("400");
		childSeatPrice = new BigDecimal("50");
		
		totalChildSeatPrice = new BigDecimal("150");
		
		languageType = LanguageType.GERMAN;
		
		resourceService = new ResourceService();
		resourceServiceController = new ResourceServiceController();
		
		resourceService.setCarResourceAnswer(1);
		resourceService.setTopBoxResourceAnswer(1);
		resourceService.setChildSeatResourceAnswer(1);
		
		resourceService.setConfirmAnswer(2);
		
		carResource = resourceService.createCarResource();
		topBoxResource = resourceService.createTopBoxResource();
		childSeatResource = resourceService.createChildSeatResource();
		
		resourceService.setCarResource(carResource);
		carResource.setPrice(carPrice);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		carResource = null;
		topBoxResource = null;
		childSeatResource = null;
		
		resourceService = null;
		resourceServiceController = null;
	}

	@Test
	@DisplayName("createCarResource(): is Car Object created")
	void createCarResource() {
		
		assertEquals(true, carResource.getClass().getSimpleName().equals("Car"));
	}
	
	@Test
	@DisplayName("createTopBoxResource(): is Car with TopBox Object created")
	void createTopBoxResource() {
		
		assertEquals(true, topBoxResource.getClass().getSimpleName().equals("TopBox"));
	}
	
	@Test
	@DisplayName("createChildSeatResource(): is Car with TopBox and ChildSeat created")
	void createChildSeatResource() {
		
		assertEquals(true, childSeatResource.getClass().getSimpleName().equals("ChildSeat"));
	}
	
	@Test
	@DisplayName("deleteResource(): is Car object null after delete operation")
	void deleteResource() {
		
		resourceService.deleteResource();
		assertEquals(null,resourceService.getCarResource());
	}
	
	@Test
	@DisplayName("calculateChildSeatPrice(BigDecimal childSeatPrice, BigDecimal amount): is Price of 3 childseats 150")
	void calculateChildSeatPrice() {
		assertEquals(new BigDecimal("150"),resourceService.calculateChildSeatPrice(childSeatPrice, new BigDecimal("3")));
	}
	
	@Test
	@DisplayName("calculateOrderPrice(Resource carResource, TopBox topBoxResource, BigDecimal totalChildSeatPrice): is Price of Car with 3 childSeats 550")
	void calculateOrderPrice() {
		
		topBoxResource = null;
		assertEquals(new BigDecimal("550"),resourceService.calculateOrderPrice(carResource, topBoxResource, totalChildSeatPrice));
	}
	
}
