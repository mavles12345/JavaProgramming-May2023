package org.programming;

import java.util.Scanner;

public class ArmstrongNumber {
	
	//An Armstrong number is a number that is equal to the sum of the cubes of its own digits. 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("User Input");

		int n = sc.nextInt();

		int a, i = 0, j = 0;

		a = n;

		while (a > 0) {

			i = a % 10;

			j = j + (i * i * i);

			a = a / 10;

		}

		if (n == j) {

			System.out.println("User input number is Armstrong number ");
		} else {

			System.out.println("User Input number is not a ArmStrong number");
		}
	}

}
