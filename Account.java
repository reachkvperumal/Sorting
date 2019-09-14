//package bank;

import java.math.BigDecimal;

// A class that provides various banking methods.
public class Account {
	private String id;
	private String name;
	private String type;
	private BigDecimal balance;
	
	// Full constructor for Account.
	protected Account(String id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
		balance = new BigDecimal("0");
	}
	
	// Deposit a BigDecimal amount into Account.
	protected void deposit(BigDecimal amount) {
		if(amount.doubleValue() > 0) {
			balance = balance.add(amount);
		}
	}
	
	// Withdraw a BigDecimal amount from Account.
	protected BigDecimal withdraw(BigDecimal amount) 
	throws InsufficientFundsException {
		if(amount.doubleValue() > 0 && 
				balance.doubleValue() - amount.doubleValue() > 0) {
			balance = balance.subtract(amount);
		} else {
			throw new InsufficientFundsException(balance.toString());
		}
		return amount;
	}
	
	// Provide information about Account.
	protected void displayInfo() {
		System.out.println("Account Details: \n");
		System.out.println("Holder: " + name);
		System.out.println("ID: " + id);
		System.out.println("Type: " + type);
		System.out.println("Balance: $" + balance.setScale(2) + "\n");
	}
}
