package test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controller.BookingServiceController;
import model.Booking;
import model.BookingBuilderGerman;
import model.BookingHeaderGerman;
import model.BookingService;
import model.CarBrandType;
import model.LanguageType;

public class BookingServiceTest {
	
	private LanguageType languageType;
	private String name;
	private BigDecimal cost;
	private CarBrandType carBrandType;
	
	private Booking booking;
	
	private BookingService bookingService;
	private BookingBuilderGerman bookingBuilderGerman;
	
	private BookingServiceController bookingServiceController;
	
	@BeforeEach
	void setUp() throws Exception {
		languageType = LanguageType.GERMAN;
		name = "Max Mustermann";
		cost = new BigDecimal("100");
		carBrandType = CarBrandType.BMW;
		
		bookingService = new BookingService();
		
		bookingBuilderGerman = new BookingBuilderGerman();
		bookingServiceController = new BookingServiceController();
		
		booking = bookingBuilderGerman.setHeader(name).setBody(carBrandType).setFooter(cost).build();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		bookingService = null;
		bookingBuilderGerman = null;
		bookingServiceController = null;
	}
	
	@Test
	@DisplayName("createBooking(BigDecimal cost, LanguageType languageType, String name, CarBrandType carBrandType): is created Object of Type Booking")
	void createBooking() {
		assertEquals(true,booking.getClass().getSimpleName().equals("Booking"));
	}
	
	@Test
	@DisplayName("deleteBooking(): is Booking Object null after delete operation")
	void deleteBooking() {
		bookingService.deleteBooking();
		assertEquals(null, bookingService.getBooking());
	}
	
	@Test
	@DisplayName("printBooking(): is Booking Object returned")
	void printBooking() {
		bookingService.setBooking(booking);
		booking = bookingService.printBooking();
		
		assertEquals(true, booking.getClass().getSimpleName().equals("Booking"));
	}
}
