package org.programming;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("User input");

		int n = sc.nextInt();

		int a, i = 0, j = 0;

		a = n;

		while (a > 0) {

			i = a % 10;

			j = (j * 10) + i;

			a = a / 10;

		}

		if (n == j) {

			System.out.println("The user input number is Palindrome number");
		} else {

			System.out.println("The user input number is not a Palindrome number");
		}

	}

}
