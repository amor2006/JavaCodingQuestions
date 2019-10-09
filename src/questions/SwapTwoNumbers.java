package questions;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		swapTwoNumbers(45, 56);
		System.out.println("-------------------------");
//		swapTwoNumbersWithTemp(45, 56);
	}

	public static void swapTwoNumbers(int a, int b) {
		System.out.println("Before swapping: " + a + " vs " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After  swapping: " + a + " vs " + b);

	}

	public static void swapTwoNumbersWithTemp(int a, int b) {
		System.out.println("Before swapping: " + a + " vs " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After  swapping: " + a + " vs " + b);
	}
}
