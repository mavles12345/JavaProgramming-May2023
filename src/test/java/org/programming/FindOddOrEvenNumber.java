package org.programming;

import java.util.Scanner;

public class FindOddOrEvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any number");

		int number = sc.nextInt();
		
		if(number%2==0) {
			
			System.out.println("User entered number is Even Number");
		}else
			
			System.out.println("User entered number is Odd Number");

	}

}
