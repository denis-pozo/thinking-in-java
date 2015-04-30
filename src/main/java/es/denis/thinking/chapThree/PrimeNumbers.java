package es.denis.thinking.chapThree;

import static es.denis.thinking.utils.Print.*;

//Chapter - Controlling Execution: Exercise 03

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
