package questions;

import java.util.Arrays;

public class Remove_extra_spaces_from_String {

	public static void main(String[] args) {

		String str = "London is the capital of GB";

		int len = removeSpaces(str).length();
		System.out.println(removeSpaces(str) + " " + len);
		
	}

	public static String removeSpaces(String str) {
		String newStr = str.replace(" ", "");
		return newStr;
	}

}
