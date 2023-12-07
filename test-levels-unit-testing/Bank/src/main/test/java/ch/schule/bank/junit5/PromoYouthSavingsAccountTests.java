package ch.schule.bank.junit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Tests for the Promo-Jugend-Sparkonto class.
 *
 * @author XXXX
 * @version 1.0
 */
public class PromoYouthSavingsAccountTests {

	/**
	 * Test depositing to PromoYouthSavingsAccount.
	 */
	@Test
	public void testDeposit() {
		// Create a PromoYouthSavingsAccount
		PromoYouthSavingsAccount account = new PromoYouthSavingsAccount("PY-1001");

		// Deposit 1000 into the account
		boolean result = account.deposit(1, 1000);

		// Check if the deposit was successful
		assertTrue(result);

		// Check if the balance is updated correctly (1000 + 10% bonus)
		assertEquals(1100, account.getBalance());
	}

	/**
	 * Test depositing a negative amount to PromoYouthSavingsAccount.
	 */
	@Test
	public void testNegativeDeposit() {
		// Create a PromoYouthSavingsAccount
		PromoYouthSavingsAccount account = new PromoYouthSavingsAccount("PY-1002");

		// Try to deposit -500 into the account
		boolean result = account.deposit(2, -500);

		// Check if the deposit failed
		assertFalse(result);

		// Check if the balance remains unchanged
		assertEquals(0, account.getBalance());
	}
}
