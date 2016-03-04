package org.denispozo.tutorial.thj.initialization.constructor.def;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 6
 */

public class DogWithOverloadedMethodAndTwoArguments {
	
	public void bark(int i, float f){
		print("RufRufRuf");
	}
	
	public void bark(float f, int i){
		print("GuauGuauGuau");
	}
	
	public static void main(String [] args){
		DogWithOverloadedMethodAndTwoArguments dogA = new DogWithOverloadedMethodAndTwoArguments();
		dogA.bark((int) 1, (float) 1);
		
		DogWithOverloadedMethodAndTwoArguments dogB = new DogWithOverloadedMethodAndTwoArguments();
		dogB.bark((float) 1, (int) 1);
	}
}
