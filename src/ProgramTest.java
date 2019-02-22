import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ProgramTest {

	@Test
	void testNameCheckerJohn_Doe01() {
		assertTrue(Program.nameChecker("John Doe"));
	}

	@Test
	void testNameCheckerJohn_J__Doe02() {
		assertTrue(Program.nameChecker("John J. Doe"));
	}

	@Test
	void testNameCheckerJCDoe03() {
		assertTrue(Program.nameChecker("J. C. Doe"));
	}

	@Test
	void testNameCheckerDoe04() {
		assertFalse(Program.nameChecker("Doe"));
	}

	@Test
	void testNameCheckerJohnCDoe05() {
		assertFalse("initials must have a period after them", Program.nameChecker("John C Doe"));
	}

	@Test
	void testNameCheckerJohn_E__E_Doe06() {
		assertTrue(Program.nameChecker("John E. E. Doe"));
	}

	///// Bday checker 01
	@Test
	void testbDayChecker01MdYrTrue() {
		assertTrue(Program.bDayChecker("02/21/2019"));
	}

	@Test
	void testbDayChecker01MdYrFalseYr() {
		assertFalse(Program.bDayChecker("02/21/1019"));
	}

	@Test
	void testbDayChecker01MdYrFalseM() {
		assertFalse(Program.bDayChecker("02/40/2019"));
	}

	@Test
	void testbDayChecker01MdYrFalseD() {
		assertFalse(Program.bDayChecker("40/30/2019"));
	}

	//// Bday checker 2
	@Test
	void testbDayChecker02MdYrTrue2() {
		assertTrue(Program.bDayChecker("04/30/22"));
	}

	@Test
	void testbDayChecker02MdYrFalseM2() {
		assertFalse(Program.bDayChecker("12/32/22"));
	}

	@Test
	void testbDayChecker02MdYrFalseYr2() {
		assertFalse(Program.bDayChecker("12/30/00"));
	}

	@Test
	void testbDayCheckerGreaterThan31() {
		assertFalse(Program.bDayChecker("03/32/2019"));
	}

	// email checker 1
	@Test
	void testEmailChecker01() {
		assertTrue(Program.emailChecker("eli.rad@touro.edu"));
	}

	// email checker 2
	void testEmailChecker02() {
		assertTrue(Program.emailChecker("eli.rad@mail.touro.edu"));
	}

	@Test
	void testEmailChecker03() {
		assertTrue(Program.emailChecker("eli@yagoo.com"));
	}

}
