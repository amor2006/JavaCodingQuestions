package questions;

import java.util.Arrays;

public class Missing_Number_in_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 10, 2, 3, 4, 5, 7, 8, 9 };
		System.out.println(arr.length);
		System.out.println(Arrays.stream(arr).sum());
		System.out.println("The missing number is " + getMissingNumber(arr));

	}

	public static int getMissingNumber(int[] arr) {
		// actual size is arr.length + 1 since a number is missing from the array
		int actualLength = arr.length + 1; // 9+1 =10

		// get sum of integers between 1 to arr.length + 1
		int expectedSum = actualLength * (actualLength + 1) / 2; // 10*(10+1)/2 =50

		// get actual sum of integers in the array
		int actualSum = Arrays.stream(arr).sum();

		// the missing number is the difference between the expected sum and the actual
		// sum
		return expectedSum - actualSum;
	}

}
