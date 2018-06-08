package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.leuphana.swa.statisticService.Booking;
import de.leuphana.swa.statisticService.BookingVisitor;
import de.leuphana.swa.statisticService.PaymentType;

class isBookingTypeCorrect {

	private BookingVisitor visitor;
	private PaymentType paymentType;
	
	Booking booking;
	
	@BeforeEach
	void setUp() throws Exception {
		visitor = new BookingVisitor();
		paymentType = PaymentType.MONEYWALLET;
		
		booking = new Booking();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		visitor = null;
		paymentType = null;
		
		booking = null;
		
	}

	@Test
	@DisplayName("visit(booking, payment): count of Googlewallet payment equals 1")
	void test() {
		assertEquals(1, visitor.visit(booking, paymentType));
	}

}
