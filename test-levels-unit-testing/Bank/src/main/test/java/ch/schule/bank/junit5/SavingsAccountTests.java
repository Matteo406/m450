package ch.schule.bank.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the SavingsAccount class.
 *
 * @author XXX
 * @version 1.0
 */
public class SavingsAccountTests {

	/**
	 * Test withdrawing from SavingsAccount with sufficient balance.
	 */
	@Test
	public void testWithdrawWithSufficientBalance() {
		// Create a SavingsAccount
		SavingsAccount account = new SavingsAccount("SA-2001");

		// Deposit 1000 into the account
		account.deposit(1, 1000);

		// Withdraw 500 from the account
		boolean result = account.withdraw(2, 500);

		// Check if the withdrawal was successful
		assertTrue(result);

		// Check if the balance is updated correctly (1000 - 500)
		assertEquals(500, account.getBalance());
	}

	/**
	 * Test withdrawing from SavingsAccount with insufficient balance.
	 */
	@Test
	public void testWithdrawWithInsufficientBalance() {
		// Create a SavingsAccount
		SavingsAccount account = new SavingsAccount("SA-2002");

		// Deposit 800 into the account
		account.deposit(1, 800);

		// Try to withdraw 1000 from the account
		boolean result = account.withdraw(2, 1000);

		// Check if the withdrawal failed
		assertFalse(result);

		// Check if the balance remains unchanged (800 - 1000 is below zero)
		assertEquals(800, account.getBalance());
	}

	/**
	 * Test withdrawing a negative amount from SavingsAccount.
	 */
	@Test
	public void testNegativeWithdraw() {
		// Create a SavingsAccount
		SavingsAccount account = new SavingsAccount("SA-2003");

		// Try to withdraw -200 from the account
		boolean result = account.withdraw(3, -200);

		// Check if the withdrawal failed
		assertFalse(result);

		// Check if the balance remains unchanged
		assertEquals(0, account.getBalance());
	}
}
