package org.programming;

public class SumofOddNumber {

	public static void main(String[] args) {
		
		int sumofOddNumber=0;
		
		for (int i = 0; i < 100; i++) {
			
			if(i%2==1) {
				
				sumofOddNumber=sumofOddNumber+i;
				
				
			}
			
		}
		
		System.out.println("sum of Odd Number:"+sumofOddNumber);

	}

}
