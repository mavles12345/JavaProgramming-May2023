package org.programming;

import org.apache.poi.util.SystemOutLogger;

public class CountofPrimeNumbers {

	public static void main(String[] args) {

		int count, c = 0;

		for (int i = 1; i < 100; i++) {

			count = 0;

			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {

					count++;
				}
			}
			if (count == 0) {

				c = c + 1;

			}

		

		}
		
		System.out.println(c);

	}
}
