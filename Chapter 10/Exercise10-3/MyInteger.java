
class MyInteger {
	
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}
	
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}
	
	public static boolean isPrime(int value) {
		for (int n = 2; n <= value / 2; n++ ) {
			if (value % n == 0) 
				return false;
		}
		return true;
	}
	
	public boolean isEvan() {
		return isEven(value);
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	public static boolean isEven(MyInteger number) {
		return number.isEvan();
	}
	
	public static boolean isOdd(MyInteger number) {
		return number.isOdd();
	}
	
	public static boolean isPrime(MyInteger number) {
		return number.isPrime();
	}
	
	public boolean equals(int sValue) {
		return sValue == value;	
	}
	
	public boolean equals(MyInteger sValue) {
		return sValue.value == this.value;
	}
	
	public static int parseInt(char[] chars) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, chars.length - 1); 
			  i < chars.length; i++, j /= 10) {
			value += (chars[i]- 48) * j;
		}
		return value;
	}


	public static int parseInt(String str) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, str.length() - 1); 
			  i < str.length(); i++, j /= 10) {
			value += (str.charAt(i) - 48) * j;
		}
		return value;
	
}
}
