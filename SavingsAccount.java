//package bank;

public class SavingsAccount extends Account {
	private double fee; // as a dollar amount (5 = $5.00).
	private double interestRate; // as a percentage (0.75 = .75%).
	private double withdrawLimit;
	private int transactionLimit;
	
	// Full constructor for SavingsAccount.
	protected SavingsAccount(String id, String name, double interestRate,
			double fee, double withdrawLimit, int transactionLimit) {
		super(id, name, "Savings");
		this.interestRate = interestRate;
		this.fee = fee;
		this.withdrawLimit = withdrawLimit;
		this.transactionLimit = transactionLimit;
	}
	
	// Return SavingsAccount interestRate.
	protected double getInterestRate() {
		return interestRate;
	}
	
	// Return SavingsAccount fee.
	protected double getFee() {
		return fee;
	}
	
	// Return SavingsAccount withdrawLimit.
	protected double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	// Return SavingsAccount transactionLimit.
	protected double getTransactionLimit() {
		return transactionLimit;
	}
	
	// Set SavingsAccount interestRate.
	protected void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	// Set SavingsAccount fee.
	protected void setFee(double fee) {
		this.fee = fee;
	}
	
	// Set SavingsAccount withdrawLimit.
	protected void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	// Set SavingsAccount transactionLimit.
	protected void setTransactionLimit(int transactionLimit) {
		this.transactionLimit = transactionLimit;
	}
	
	// Provide interestRate of SavingsAccount.
	protected void displayInterestRate() {
		System.out.println("Interest Rate: " + interestRate + "%");
	}
}
