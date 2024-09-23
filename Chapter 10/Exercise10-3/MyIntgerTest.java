/*
Name: Robert Riddle
Date: 30/08/2024


 */
public class MyIntgerTest {
	public static void main(String[] args) {
		
	int[] values = { 3, 9, 4, 7, 6, 8,};
		
		System.out.println("Will test if values are even using the isEven(int)\n");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " is " + MyInteger.isEven(values[i]));
		}
		
		System.out.println("\nWill test if values are odd using the isOdd(int)\n");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " is " + MyInteger.isOdd(values[i]));
		}
			
		System.out.println("\nWill test if values are prime using the isprime(int)\n");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " is " + MyInteger.isPrime(values[i]));
		}
		
		System.out.println("\nWill test if values are even using the isEven()\n");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " is " + value.isEvan());
		}
		
		System.out.println("\nWill test if values are odd using the isOdd()\n");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " is " + value.isOdd());
		}
		
		System.out.println("\nWill test if values are prime using the isPrime()\n");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " is " + value.isPrime());
		}
		
		System.out.println("\nWill test if values are even using the isEven(MyInteger):");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isEven(value));
		}
		
		System.out.println("\nWill test if values are odd using the isOdd(MyInteger):");
		for (int i = 0; i < values.length; i++) {
			// Create a MyInteger
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
		}
		
		System.out.println("\nTest if values are Prime using isPrime(MyInteger):");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
		}
		
		int[] values2 = {3, 8, 7};
		MyInteger value = new MyInteger(8);
		System.out.println("\nWill Test if " + value.getValue() + 
			" is equal to the value:");
		for (int i = 0; i < values2.length; i++) {
			System.out.println(values2[i] + " " + value.equals(values2[i]));
		}
		System.out.println("\nWill Test if " + value.getValue() + 
			" is equal to the value:");
		for (int i = 0; i < values2.length; i++) {
			MyInteger myInteger = new MyInteger(values2[i]);	
			System.out.println(values2[i] + " " + value.equals(myInteger));
		}
		
		System.out.println("\nTest parseInt(char[]) and parseInt(String):");
		char[] numChar = {'3', '4', '2'};

		
		String numericString = "658";
		System.out.print("\'");
		for (int i = 0; i < numChar.length; i++) {
		 	System.out.print(numChar[i] + "");
		} 
		System.out.println("\' + \"" + numericString + "\" = " + 
			(MyInteger.parseInt(numChar) + 
			MyInteger.parseInt(numericString)));
	}
}