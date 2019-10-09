package questions;

import java.util.Arrays;

public class Largest_number_in_Array {
	public static void main(String[] args) {
		int[] arr = { 3, 42, 7, 122, 1246, 1000, 450 };
		System.out.println("Largest number is: " + largest_number(arr));
		System.out.println("Smallest number is: " + smallest_number(arr));
	}

	public static int largest_number(int[] arr) {
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		return max;
	}

	public static int smallest_number(int[] arr) {
		Arrays.sort(arr);
		int min = arr[0];
		return min;
	}
}
