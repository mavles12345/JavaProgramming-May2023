package org.programming;

import java.util.Scanner;

public class PrintArmstrongNumber {

	// An Armstrong number is a number that is equal to the sum of the cubes of its
	// own digits.

	public static void main(String[] args) {

		for (int n = 0; n < 1000; n++) {

			int a, i = 0, j = 0;

			a = n;

			while (a > 0) {

				i = a % 10;

				j = j + (i * i * i);

				a = a / 10;

			}

			if (n == j) {

				System.out.println(j);
			}
		}

	}

}
