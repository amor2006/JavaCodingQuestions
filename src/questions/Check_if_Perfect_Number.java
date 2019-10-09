package questions;

public class Check_if_Perfect_Number {
	/*
	 * A perfect number is a positive integer that is equal to the sum of its proper
	 * positive divisors excluding itself. The first perfect number is 6, because
	 * 6=1 + 2 + 3.
	 */
	public static void main(String[] args) {
		System.out.println(isPerfect(28));
		System.out.println(isPerfect(27));
	}

	public static boolean isPerfect(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				sum = sum + i;
		}

		if (number == sum) {
			return true;
		}
		return false;
	}

}
