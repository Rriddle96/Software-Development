public class CheckingsAccount extends Account {
	
    private double overDraftLimit;
    

    public CheckingsAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overDraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverdraftLimit() {
        return overDraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= -overDraftLimit) {
            setBalance(getBalance() - amount);
            
        } else {
            System.out.println("Error: Exceeded overdraft limit");
        }
    }

    public String toString() {
        return super.toString() + ", Overdraft Limit: $" + String.format("%.2f", overDraftLimit);
    }
}