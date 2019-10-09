package questions;

public class Palindrome_Number {

	public static void main(String[] args) {
		System.out.println(isPalindrome_number(121));
		System.out.println(isPalindrome_number(121121));
	}

	public static boolean isPalindrome_number(int number) {
		int reversed = 0;
		int temp = number;
		int sum = 0;
		while (number > 0) {
			reversed = number % 10;
			number = number / 10;
			sum = sum * 10 + reversed;
		}
		if (temp == sum) {
			return true;
		}
		return false;
	}
}
