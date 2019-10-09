package questions;

public class Check_if_Prime_or_no {

	/*
	 * A prime number is a number that is only divisible by 1 or itself. For
	 * example, 11 is only divisible by 1 or itself. Other Prime numbers 2, 3, 5, 7,
	 * 11, 13, 17.... Note: 0 and 1 are not prime numbers. 2 is the only even prime
	 * number.
	 */


	public static void main(String[] args) {

		System.out.println(isPrimeNumber(39857));
	}
// comment
	
	public static boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number) / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
