package questions;

import java.util.Scanner;

public class Fibonacci_Numbers {

	// 0 1 1 2 3 5 8 13 21 34 55

	public static void main(String[] args) {
		printFibonacciNumbers(10);

	}

	public static void printFibonacciNumbers(int max) {
		int first = 0;
		int second = 1;

		for (int i = 1; i <= max; i++) {
			System.out.print(first + " ");
			int sum = first + second; // 0+1=1
			first = second; // n1=1
			second = sum; // n2=1
		}
		
	}

}
