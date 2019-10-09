package questions;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Elements_in_Array {

	public static void main(String[] args) {
		String languages[] = { "Java", "JavaScript", "Ruby", "Python", "Java", "C#" };

		System.out.println("************************");
		duplicate_elements_2nd(languages);

	}


	public static Set<String> duplicate_elements_2nd(String arr[]) {
		Set<String> store = new HashSet<>();
		for (String str : arr) {
			if (store.add(str) == false) {
				System.out.println("Duplicate element is: " + str);
			}
		}
		return store;
	}



}
