package org.example;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Get the singleton instance of the Bank
		Bank ubs = Bank.getInstance();

		ubs.createPromoYouthSavingsAccount();
		ubs.createSalaryAccount(12000);

		// Trying to create a new instance will not work
		// Bank anotherBank = new Bank(); // This line will result in a compilation error
	}

}
