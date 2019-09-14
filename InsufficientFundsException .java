//package bank;

// InsufficientFundsException class.
class InsufficientFundsException extends Exception {
	private static final long serialVersionUID = 7384059641196567537L;
	private String balance;
	
	protected InsufficientFundsException(String balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Insufficient Funds! - Current Balance: $" + balance + "\n";
	}
}
