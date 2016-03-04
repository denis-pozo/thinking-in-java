package org.denispozo.tutorial.thj.controlling.execution;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Controlling Execution: Exercise 04

public class PrimeNumbers {
	
	public static void main(String[] args) {
		boolean primeNumber;
		
		for(int i = 2 ; i <= 100 ; i++){
			primeNumber = true;
			for(int j = 2 ; j < i ; j++){
				if(i % j == 0){
					primeNumber = false;
				}
			}
			if(primeNumber){
				print("Number " + i + " is prime");
			}
		}
	}
}
