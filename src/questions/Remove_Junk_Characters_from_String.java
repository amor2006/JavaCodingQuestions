package questions;

public class Remove_Junk_Characters_from_String {

	public static void main(String[] args) {

		String str = "$$@    Az&er145bai@#jan";
		System.out.println("Without special characters and numbers: " + remove_junk_elements_and_numbers(str));
		printLast4("123450622335");
		System.out.println(keepOnlyNumbers(str));
	}

	public static String remove_junk_elements_and_numbers(String str) {
		str = str.replaceAll("[^a-zA-Z]", "");
		return str;
	}

	public static void printLast4(String str) {
		String number = "12345469565953546";
		String mask = number.replaceAll("\\w(?=\\w{4})", "*");
		System.out.println(mask);
	}

	public static String keepOnlyNumbers(String str) {
		return str = str.replaceAll("[^0-9]", "");
	}

}
