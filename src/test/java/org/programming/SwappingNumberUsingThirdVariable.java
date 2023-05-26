package org.programming;

import java.util.Scanner;

public class SwappingNumberUsingThirdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b = sc.nextInt();

		int c;

		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);

		c = a;

		a = b;

		b = c;

		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);

	}

}
