package org.denispozo.tutorial.thj.initialization.constructor.def;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 5
 */

public class DogWithOverloadedMethod {
			
	public void bark(int i){
		print("RufRufRuf");
	}
	
	public void bark(float f){
		print("GuauGuauGuau");
	}
	
	public static void main(String [] args){
		DogWithOverloadedMethod dogA = new DogWithOverloadedMethod();
		dogA.bark((int) 1);
		
		DogWithOverloadedMethod dogB = new DogWithOverloadedMethod();
		dogB.bark((float) 1);
	}
}
