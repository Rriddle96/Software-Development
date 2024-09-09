
public class SavingsAccount extends Account {
		
	public SavingsAccount(int id, double balance) {
		super (id, balance);
		
	}
	
	public void withdraw(double amount) {
		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
		}
		else {
			System.out.println("Error: Insufficient funds for withdrawal");
		}
		
	}
    public String toString() {
        return String.format("Savings %s", super.toString());
    }
        
}

