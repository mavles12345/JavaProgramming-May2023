package org.programming;

import java.util.Scanner;

public class SwappingNumberWithoutThirdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b = sc.nextInt();

		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);

	}

}
