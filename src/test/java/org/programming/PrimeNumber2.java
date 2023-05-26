package org.programming;

public class PrimeNumber2 {

	public static void main(String[] args) {
		
		
		int n=3, count=0;
		
		
		if(n>1) {
			
			for (int i = 1; i <= 3; i++) {
				
				if(n%i==0) {
					
					count++;
				}
				
			}
			
			if(count==2) {
				
				System.out.println("Prime Number");
			}
			
			else
				
				System.out.println("Not a Prime Number");
		}
		

	}

}
