package ch.schule.bank.junit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Tests for the 'Booking' class.
 *
 * @author Luigi Cavuoti
 * @version 1.1
 */
public class BookingTests {

	/**
	 * Tests for the initialization of bookings.
	 */
	@Test
	public void testInitialization() {
		// Test creating a booking with a positive amount
		Booking booking1 = new Booking(1, 100);
		assertEquals(1, booking1.getDate());
		assertEquals(100, booking1.getAmount());

		// Test creating a booking with a negative amount
		Booking booking2 = new Booking(2, -50);
		assertEquals(2, booking2.getDate());
		assertEquals(-50, booking2.getAmount());
	}

	/**
	 * Test printing the booking details.
	 */
	@Test
	public void testPrint() {
		Booking booking = new Booking(1, 100);
		// Redirect system.out to capture printed output
		StringBuilder printedOutput = new StringBuilder();
		System.setOut(new java.io.PrintStream(new java.io.ByteArrayOutputStream()) {
			public void println(String message) {
				printedOutput.append(message).append("\n");
			}
		});

		booking.print(500);

		// Reset system.out to the original output stream
		System.setOut(System.out);

		// Check if the printed output matches the expected format
		String expectedOutput = "01.01.1971  1.00 501.00\n";
		assertEquals(expectedOutput, printedOutput.toString());
	}
}