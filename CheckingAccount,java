//package bank;

// A Chequing Account class that extends the Account class.
public class CheckingAccount extends Account {
	private double fee; // as a percentage (1.25 == 1.25 %).
	private int withdrawLimit;
	private int transactionLimit;
	
	// Full constructor for ChequingAccount.
	protected CheckingAccount(String id, String name, 
			double fee, int withdrawLimit, int transactionLimit) {
		super(id, name, "Chequing");
		this.fee = fee;
		this.withdrawLimit = withdrawLimit;
		this.transactionLimit = transactionLimit;
	}
	
	// Return the monthly account fee.
	protected double getFee() {
		return fee;
	}
	
	// Return the withdrawLimit of ChequingAccount.
	protected int getWithdrawLimit() {
		return withdrawLimit;
	}
	
	// Return the transactionLimit of ChequingAccount.
	protected int getTransactionLimit() {
		return transactionLimit;
	}
	
	// Set ChequingAccount fee.
	protected void setFee(double fee) {
		this.fee = fee;
	}
	
	// Set ChequingAccount withdrawLimit.
	protected void setWithdrawLimit(int withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	// Set CheckingAccount transactionLimit.
	protected void setTransactionLimit(int transactionLimit) {
		this.transactionLimit = transactionLimit;
	}
}
