package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.leuphana.swa.bookingService.Booking;
import de.leuphana.swa.bookingService.BookingBuilder;
import de.leuphana.swa.bookingService.BookingType;

class isBookingTypeCorrect {

	BookingBuilder builder;
	
	Booking booking;
	
	BookingType bookingType;
	
	@BeforeEach
	void setUp() throws Exception {
		builder = new BookingBuilder();

		bookingType = BookingType.GERMAN;
		
        builder.setHeader(bookingType);
        
        
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
	}

}
