/*
Name: Robert Riddle
Date: 09/03/2024

This program 

 */

import java.util.Scanner;

public class Exercise10_7 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	Account[] accounts = new Account[10];
	
	createBalance(accounts);
	
	int option = 0;
    int id = askForId(accounts);
    while (option != 4) {
        System.out.print("\nMain menu\n" +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: exit\n" +
                "Enter a choice: ");
        
        option = input.nextInt();
        switch (option) {
            case 1:
                System.out.printf("Your balance is $%.2f\n",  accounts[id].getBalance());
                break;
            case 2:
                System.out.print("Enter withdraw amount: ");
                accounts[id].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.print("Enter deposit amount: ");
                accounts[id].deposit(input.nextDouble());
                break;
            case 4:
                System.out.println("Logged out...");
                System.out.println("");
                id = askForId(accounts);
                option = 0;
                break;
                default:
                    System.out.println("Invalid input.. Enter a number 1-4");
                    
        	}
        
    	}
    
	}

	public static void createBalance(Account[] accounts) {
		int intitalBalance = 100;
		
		for ( int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i , intitalBalance);
			
		}
		
	}

	public static int askForId(Account[] accounts) {
		Scanner input = new Scanner(System.in);
		
		int id = 0;
		boolean validId = false;
		
		while(!validId) {
			System.out.print("Enter ID: ");
			id = input.nextInt();
			
			if (!hasId(accounts, id)) {
				System.out.print("\nInvalid ID. Reenter ID.");
				
			}
			
			else {
				validId = true; 
			}
		}
		
		return id;
	}
	
	public static boolean hasId(Account[] accounts, int id) {
		
		for (Account account : accounts) {
			if (id == account.getId()) {
				
				return true;
				
			}
		}
		
		return false;
		
	}
	
}
