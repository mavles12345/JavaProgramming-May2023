package org.programming;

import org.apache.poi.util.SystemOutLogger;

public class CountofPrimeNumbers2 {

	public static void main(String[] args) {
		
		int count, c=0;

		for (int i = 1; i <= 100; i++) {
			
			count=0;
			
			for (int j = 1; j <= i; j++) {
				
				if(i%j==0) {
					
					count++;
				}
				
			}
			
			if(count==2) {
				
				System.out.println(i);
				
				c++;
			}
			
		}
		
		System.out.println(c);
		
	}}


