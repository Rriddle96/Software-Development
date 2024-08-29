/*
Name: Robert Riddle
Date: 08/28/2024
This program is designed to test the Account object Class 
 */


import java.util.Date;

public class AccountTest {
	public static void main(String[] args) {
		
		Account account = new Account (1122, 20000);
		
		account.makeAnnualIntrestRate(4.5);
		
		account.withdraw(2500);
		
		account.deposit(3000);
		
		System.out.println("|Account Statement|");
		System.out.println("-------------------\n");

		System.out.println("Account ID: " + account.getId());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly Intrest: $%.2f\n", account.MonthlyIntrest());
		System.out.println("Date Created: " + account.makeDateCreated());

		
	}

}
