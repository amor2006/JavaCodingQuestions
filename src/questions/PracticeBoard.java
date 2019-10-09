package questions;

import java.util.HashSet;
import java.util.Set;

public class PracticeBoard {
	public static void main(String[] args) {
		String languages[] = { "Java", "JavaScript", "Ruby", "Python", "Java", "C#" };
		System.out.println(isPrime(121));
		System.out.println(revString("KamranAyyubov"));
		System.out.println(revString2("KamranAyyubov"));
		duplicateElements(languages);
		eliminateDuplicates(languages);
		swapNumbers(5, 3);
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static String revString2(String str) {
		String rev = "";
		return rev = new StringBuilder(str).reverse().toString();
	}

	// let's imagine that a=5; b=3;
	public static void swapNumbers(int a, int b) {
		System.out.println("Before swap: " + "a = " + a + ", " + " b = " + b);
		a = a + b; // 5+3=8;
		b = a - b; // 8-5=3;
		a = a - b; // 8-3=5;
		System.out.println("After swap: " + "a = " + a + ", " + " b = " + b);
	}

	public static Set<String> eliminateDuplicates(String[] strArr) {
		Set<String> store = new HashSet<>();

		for (String str : strArr) {
			if (store.add(str) == false) {
				System.out.println("Duplicate element is " + str);
			}
		}
		return store;
	}

	public static String revString(String str) {
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	public static Set<String> duplicateElements(String[] arr) {
		Set<String> store = new HashSet<>();

		for (String element : arr) {
			if (store.add(element) == false) {
				System.out.println("Duplicate element is " + element);

			}
		}

		return store;
	}
}
