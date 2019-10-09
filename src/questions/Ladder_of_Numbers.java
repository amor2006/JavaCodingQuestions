package questions;

public class Ladder_of_Numbers {

	public static void main(String[] args) {
		printLadder(6);
	}

	public static void printLadder(int stepNumber) {

		for (int i = 1; i <= stepNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
