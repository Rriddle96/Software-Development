import java.util.Date;

class Account {
		
		private int id;
		private double balance;
		private static double annualIntrestRate;
		private Date dateCreated;
		
		Account() {
		id = 0;
		balance = 0;
		annualIntrestRate = 0;
		dateCreated = new Date();
		}
		
		Account(int newId, double newBalance) {
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
			
		}
		
		public void makeId(int newId) {
			id = newId;
			
		}
		
		public void makeBalance(double newBalance) {
			balance = newBalance;
		}
		
		public void makeAnnualIntrestRate(double newAnnualIntrestRate) {
			annualIntrestRate = newAnnualIntrestRate;
		}
		
		public int getId() {
			return id;
		}
		
		
		public double getBalance() {
			return balance;
			
		}
		
		public double getAnnualIntrestRate() {
			return annualIntrestRate;
		}
		
		public String makeDateCreated() {
			return dateCreated.toString();
		}
		
		public double getMonthlyIntrestRate() {
			return annualIntrestRate / 12;
		}

		double MonthlyIntrest() {
			return balance * getMonthlyIntrestRate() / 100;
			
		}
		
		public void withdraw(double amount) {
			balance -= amount;
		}
		
		public void deposit(double amount) {
			balance += amount;
		}
			
	

}
