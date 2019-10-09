package questions;

public class Palindrome_word {

	public static void main(String[] args) {
		String word = "tattarrattat"; // the longest palindrome word
		System.out.println(isPalindrome(word));
		System.out.println(isPalindrome("civic"));
	}

	public static boolean isPalindrome(String str) {

		int len = str.length();

		for (int i = 0; i <= len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i))
				return false;
		}
		return true;
	}
}
