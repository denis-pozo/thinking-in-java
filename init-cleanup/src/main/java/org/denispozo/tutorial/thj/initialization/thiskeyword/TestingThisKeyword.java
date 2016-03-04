package org.denispozo.tutorial.thj.initialization.thiskeyword;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 8
 */

public class TestingThisKeyword {
	
	public void firstMethod(){
		print("Calling with this");
		this.secondMethod();
		print("Calling without this");
		secondMethod();
	}
	
	public void secondMethod(){
		print("secondMethod has been called!!!");
	}
	public static void main(String [] args){
		TestingThisKeyword eight = new TestingThisKeyword();
		eight.firstMethod();
	}
}
