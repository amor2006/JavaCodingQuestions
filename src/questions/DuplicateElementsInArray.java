package questions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void eleminateDuplicates(String[] arr) {
		Set<String> set = new HashSet<>();
		for (String name : arr) {
			if (set.add(name) == false) {
				System.out.println("Duplicate is: " + name);
			} else if (set.add(name) == true) {
				System.out.println("There is no duplicate");
			}
		}
	}

	public static void main(String[] args) {
		String arr[] = { "Java", "Python", "C+", "Ruby", "Javascript"};
		eleminateDuplicates(arr);
		System.out.println();
	}

}
