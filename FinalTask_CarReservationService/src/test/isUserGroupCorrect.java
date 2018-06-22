package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.leuphana.swa.organisationService.UserGroup;

class isUserGroupCorrect {

	private String userName;

	private int userGroupId;
	
	UserGroup usergr;
	
	@BeforeEach
	void setUp() throws Exception {
		userGroupId = 1;
		userName = "IT";
		usergr = new UserGroup(userGroupId, userName);
	}

	@AfterEach
	void tearDown() throws Exception {
		usergr = null;
	}

	@Test
	@DisplayName("getUserGroupId(): is usergrId equals 1")
	void test() {
		assertEquals(1, usergr.getUserGroupId());
	}

}
