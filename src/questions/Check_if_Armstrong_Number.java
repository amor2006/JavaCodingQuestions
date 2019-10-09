package questions;

public class Check_if_Armstrong_Number {

	/*
	 * What is Armstrong Number ? In an Armstrong Number, the sum of power of
	 * individual digits is equal to number itself.
	 *
	 */

	public static void main(String args[]) {
		isArmstrong(152);
		

	}

	public static boolean isArm(int number) {

		int sum = 0;
		int digit;
		int temp = number;

		while (number > 0) {
			digit = temp % 10;

		}
		return true;
	}

	public static void isArmstrong(int number) {
		int sum = 0;
		int digit;
		int temp;

		temp = number;
		while (temp > 0) {
			digit = temp % 10;
			sum = sum + (digit * digit * digit);
			temp = temp / 10;
		}
		if (number == sum)
			System.out.println(number + " is an armstrong number");
		else {
			System.out.println(number + " is not an armstrong number");
		}

	}

}