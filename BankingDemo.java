//package bank;

import java.math.BigDecimal;

// Demonstrate bank package.
class BankingDemo {
	// Demonstration objects.
	private static BigDecimal obj;
	private static ChequingAccount ca;
	private static SavingsAccount sa;
	
	// Filler banking info.
	private static String id;
	private static String name;
	private static double interestRate;
	private static double fee;
	private static int withdrawLimit;
	private static int transactionLimit;
	
	private static void runChequingAccountDemo() {
		obj = new BigDecimal("100");
		ca = new ChequingAccount(id, name, fee, withdrawLimit, transactionLimit);
		
		// Deposit $100.00 into ChequingAccount.
		ca.deposit(obj);
		ca.displayInfo();
		
		obj = BigDecimal.valueOf(50.12);
		
		System.out.println("Attempting to withdraw $" + obj + "\n");
		try {
			ca.withdraw(obj);
			ca.displayInfo();
		} catch(InsufficientFundsException e) {
			System.out.println(e);
		}
		
		obj = BigDecimal.valueOf(75);
		
		// Won't work!
		System.out.println("Attempting to withdraw $" + obj + "\n");
		try {
			ca.withdraw(obj);
			ca.displayInfo();
		} catch(InsufficientFundsException e) {
			System.out.println(e);
		}
	}
	
	private static void runSavingsAccountDemo() {
		sa = new SavingsAccount(id, name, interestRate, fee, withdrawLimit, transactionLimit);
		obj = BigDecimal.valueOf(100);
		
		// Deposit $100.00 into SavingsAccount.
		sa.deposit(obj);
		sa.displayInfo();
		
		obj = BigDecimal.valueOf(50.12);
		
		System.out.println("Attempting to withdraw $" + obj + "\n");
		try {
			sa.withdraw(obj);
			sa.displayInfo();
		} catch(InsufficientFundsException e) {
			System.out.println(e);
		}
		
		obj = BigDecimal.valueOf(75);
		
		// Won't work!
		System.out.println("Attempting to withdraw $" + obj + "\n");
		try {
			sa.withdraw(obj);
			sa.displayInfo();
		} catch(InsufficientFundsException e) {
			System.out.println(e);
		}
		
		sa.displayInterestRate();
	}
	
	public static void main(String args[]) {
		// ChequingAccount demonstration.
		id = "1";
		name = "John";
		fee = 1.25;
		withdrawLimit = 500;
		transactionLimit = 12;
		
		runChequingAccountDemo();
		
		System.out.println();
		
		// SavingsAccount demonstration.
		fee = 5.0;
		transactionLimit = 1;
		interestRate = .75;
		
		runSavingsAccountDemo();
	}
}
