package ch.schule.bank.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the SalaryAccount class.
 *
 * @author XXX
 * @version 1.1
 */
public class SalaryAccountTests {

	/**
	 * Test withdrawing from SalaryAccount with sufficient balance.
	 */
	@Test
	public void testWithdrawWithSufficientBalance() {
		// Create a SalaryAccount with a credit limit of -1000
		SalaryAccount account = new SalaryAccount("SA-1001", -1000);

		// Deposit 500 into the account
		account.deposit(1, 500);

		// Withdraw 300 from the account
		boolean result = account.withdraw(2, 300);

		// Check if the withdrawal was successful
		assertTrue(result);

		// Check if the balance is updated correctly (500 - 300)
		assertEquals(200, account.getBalance());
	}

	/**
	 * Test withdrawing from SalaryAccount with insufficient balance.
	 */
	@Test
	public void testWithdrawWithInsufficientBalance() {
		// Create a SalaryAccount with a credit limit of -1000
		SalaryAccount account = new SalaryAccount("SA-1002", -1000);

		// Deposit 500 into the account
		account.deposit(1, 500);

		// Try to withdraw 800 from the account
		boolean result = account.withdraw(2, 800);

		// Check if the withdrawal failed
		assertFalse(result);

		// Check if the balance remains unchanged (500 - 800 is below the credit limit)
		assertEquals(500, account.getBalance());
	}

	/**
	 * Test withdrawing a negative amount from SalaryAccount.
	 */
	@Test
	public void testNegativeWithdraw() {
		// Create a SalaryAccount with a credit limit of -1000
		SalaryAccount account = new SalaryAccount("SA-1003", -1000);

		// Try to withdraw -200 from the account
		boolean result = account.withdraw(3, -200);

		// Check if the withdrawal failed
		assertFalse(result);

		// Check if the balance remains unchanged
		assertEquals(0, account.getBalance());
	}
}