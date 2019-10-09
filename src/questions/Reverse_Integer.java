package questions;

public class Reverse_Integer {

	public static void main(String[] args) {

		System.out.println("Reverse number is: " + reverse_int_1st(12345));
		System.out.println("Reverse number is: " + reverse_int_2nd(12345));
	}

//1.Using algorithm
	public static int reverse_int_1st(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}

//2.Using StringBuilder 
	public static StringBuilder reverse_int_2nd(long num1) {
		StringBuilder rev = new StringBuilder(String.valueOf(num1)).reverse();
		return rev;
	}

}
