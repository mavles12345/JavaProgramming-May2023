package org.programming;

public class CountofEvenNumber {

	public static void main(String[] args) {

		int countofEvenNumber = 0;

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {

				countofEvenNumber = countofEvenNumber + 1;

			}

		}

		System.out.println("Count of Even Number:" + countofEvenNumber);

	}

}
