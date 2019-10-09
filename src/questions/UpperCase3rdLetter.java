package questions;

public class UpperCase3rdLetter {

	public static void main(String[] args) {
System.out.println(upperEach3rd("anaksunamun"));
	}

	public static String upperEach3rd(String str) {
		char[] arr = str.toCharArray();
		for (int i = 2; i < arr.length; i += 3) {
			arr[i] = Character.toUpperCase(arr[i]);
		}

		str = new String(arr);

		return str;
	}

}
