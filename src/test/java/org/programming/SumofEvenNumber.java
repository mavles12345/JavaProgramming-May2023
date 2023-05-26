package org.programming;

public class SumofEvenNumber {

	public static void main(String[] args) {

		int sumofEvenNumber = 0;
		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {

				sumofEvenNumber = sumofEvenNumber + i;
			}
		}

		System.out.println("sum of Even Number:" + sumofEvenNumber);

	}

}
