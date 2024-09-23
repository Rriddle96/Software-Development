/*
Name: Robert Riddle
Date: 09/09/2024

 This program creates and tests an Account, Savings Account, and Checking Account. In this program
 You will be pick able to enter a balance, interest rate, withdraw, and deposit in each account.
 The Savings account will have a withdraw limit check that will stop you from going over the balance.
 The Checking account will allow you to withdraw over a certain amount until it stops you.
 */

import java.util.Scanner;
public class SavingsAndCheckingsTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int option = 0;

		while (option != 4) {
		
		System.out.println("Menu\n"
				+ "1 Account\n"
				+ "2 Checkings\n"
				+ "3 Savings\n"
				+ "4 Exit System");
		option = input.nextInt();
		
		switch (option) {
		
		case 1:
			Account account = new Account(1123, 1000);
			
			System.out.println("enter balance");
			account.setBalance(input.nextDouble());
			System.out.println("enter a intrest rate");
			account.setAnnualIntrestRate(input.nextDouble());	
			System.out.println("enter a withdraw amount");
			account.withdraw(input.nextDouble());
			System.out.println("enter a deposit amount");
			account.deposit(input.nextDouble());
			
			System.out.print(account.toString());
			break;
		case 2:
			CheckingsAccount checkings = new CheckingsAccount(1124, 1000, 30);
			
			System.out.println("enter balance");
			checkings.setBalance(input.nextDouble());
			System.out.println("enter a intrest rate");
			checkings.setAnnualIntrestRate(input.nextDouble());	
			System.out.println("enter a withdraw amount");
			checkings.withdraw(input.nextDouble());
			System.out.println("enter a deposit amount");
			checkings.deposit(input.nextDouble());
			
			System.out.println(checkings.toString());
			break;
			
		case 3:
			SavingsAccount savings = new SavingsAccount(1125, 1000);
			
			System.out.println("enter balance");
			savings.setBalance(input.nextDouble());
			System.out.println("enter a intrest rate");
			savings.setAnnualIntrestRate(input.nextDouble());	
			System.out.println("enter a withdraw amount");
			savings.withdraw(input.nextDouble());
			System.out.println("enter a deposit amount");
			savings.deposit(input.nextDouble());
			
			System.out.println(savings.toString());
		case 4:
			System.out.println("Exiting System...");
			break;
			
			default:
				System.out.println("Error. Invalid input\n"
						+ "Enter a number from 1 - 4");

				
		}
		
		}
		
		
	}

}
