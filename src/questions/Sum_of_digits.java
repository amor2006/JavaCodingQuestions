package questions;

public class Sum_of_digits {

	public static void main(String[] args) {
		System.out.println(sum_of_digits(1555));

	}

	public static int sum_of_digits(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

}
