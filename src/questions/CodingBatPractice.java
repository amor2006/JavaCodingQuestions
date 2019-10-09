package questions;

public class CodingBatPractice {
	public static void main(String[] args) {

//		System.out.println(everyNth("kamran", 2));
//		System.out.println(in3050(35, 31));
//		System.out.println(stringTimes("kamran", 4));
//		System.out.println(doubleX("xaxx"));
//		System.out.println(stringBits("Hello"));
		System.out.println(stringSplosion("abc"));
		System.out.println(last2("axxxaaxx"));
	}

	public static int last2(String str) {
		if (str.length() < 2) {
			return 0;
		}
		int count = 0;

		String lastTwo = str.substring(str.length() - 2);
		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals(lastTwo)) {
				count++;
			}

		}

		return count;
	}

	////////////////////////////////////////////////////

	public static String stringBits(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i += 2) {
			newStr += str.charAt(i);
		}

		return newStr;

	}

	////////////////////////////////////////////////////
	public static String stringSplosion(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr += str.substring(0, i + 1);
		}

		return newStr;

	}

////////////////////////////////////////////////
	public static boolean doubleX(String str) {
		int i = str.indexOf("x");
		if (i == -1)
			return false;
		String x = str.substring(i);
		return x.startsWith("xx");

	}

	/////////////////////////////////////////////////////
	public static String everyNth(String str, int n) {
		String newStr = "";
		for (int i = 0; i < str.length(); i += n) {

			newStr = newStr + str.charAt(i);

		}

		return newStr;

	}

	////////////////////////////////////////////////////

	public static boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}

		return count >= 1 & count <= 3;

	}

	///////////////////////////////////////////////////
	public String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}

		else {
			return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
		}
	}
	/////////////////////////////////////////////////

	public static boolean in3050(int a, int b) {
		if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
			return true;
		}
		if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
			return true;
		}

		return false;

	}
	////////////////////////////////////////////////

	public static boolean lastDigit(int a, int b) {
		return b % 10 == a % 10;
	}

	///////////////////////////////////////////////////

	public static String front3(String str) {
		String front;
		if (str.length() >= 3) {
			front = str.substring(0, 3);
		} else {
			front = str;
		}
		return front + front + front;
	}

	//////////////////////////////////////////////////

	public static String stringTimes(String str, int n) {
		String newStr = "";

		for (int i = 0; i < n; i++) {
			newStr += str;
		}

		return newStr;
	}

}
