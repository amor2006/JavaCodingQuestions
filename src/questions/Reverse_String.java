package questions;

public class Reverse_String {

// Using For Loop
	public static String reverse_with_for_loop(String str) {
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

// Using StringBuilder
	public static String reverse_with_Stringbuilder(String str) {
		String reverse_str = new StringBuilder(str).reverse().toString();
		return reverse_str;
	}

	public static void main(String[] args) {
		System.out.println("Reverse string with 1st method is: " + reverse_with_for_loop("KAMRAN"));
		System.out.println("Reverse string with 2nd method is: " + reverse_with_Stringbuilder("KAMRAN"));

	}

}
