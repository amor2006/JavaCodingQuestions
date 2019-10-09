package questions;

import java.util.Arrays;

public class First_two_MAX_Numbers_in_Array {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 41, 12, 456, 332 };
		returnTwoMaxNumbers(arr);

	}

	public static void returnTwoMaxNumbers(int[] arr) {
		Arrays.sort(arr);
		System.out.println("1st max number: " + arr[arr.length - 1]);
		System.out.println("2nd max number: " + arr[arr.length - 2]);
	}

}
