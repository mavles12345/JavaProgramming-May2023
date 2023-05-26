package org.programming;

import java.util.Scanner;

public class PrimNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("User Input");

		int n = sc.nextInt();

		int count = 0;

		for (int i = 2; i < n / 2; i++) {

			if (n % i == 0) {

				count = 1;
			}

		}

		if (count == 0) {

			System.out.println("Prime Number");
		}

		else {

			System.out.println("Not a Prime Number");
		}

	}

}
