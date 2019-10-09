package questions;

public class Convert_String_to_char {

	public static void main(String[] args) {
		strTochar("Jumanji");
	}

	public static void strTochar(String str) {
		int strLength = str.length();
		for (int i = 0; i < strLength; i++) {
			char myChar = str.charAt(i);
			System.out.println("Char at position -" + i + "- is " + myChar);
		}

	}

}
