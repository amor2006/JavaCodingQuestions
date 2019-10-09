package questions;

public class Factorial_of_a_number {

	public static void main(String[] args) {
		System.out.println(findFactorial(6));
	}

	public static int findFactorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
