package org.programming;

public class CountofOddNumber {

	public static void main(String[] args) {

		int countofOddNumber = 0;

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 1) {

				countofOddNumber = countofOddNumber + 1;

			}

		}

		System.out.println(countofOddNumber);
	}

}
