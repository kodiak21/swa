package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.leuphana.swa.paymentService.Account;

class isAccountCorrect {

	private Account sender;

	@BeforeEach
	void setUp() throws Exception {
		sender = new Account(1000);
	}

	@AfterEach
	void tearDown() throws Exception {
		sender = null;
	}

	@Test
	@DisplayName("sender.getAccountNumber(): account Number is correct")
	void test() {
		assertEquals(1000, sender.getAccountNumber(), 1e-10);
	}

}
