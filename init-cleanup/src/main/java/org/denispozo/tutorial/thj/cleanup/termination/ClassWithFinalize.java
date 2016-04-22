package org.denispozo.tutorial.thj.cleanup.termination;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 10
 */

public class ClassWithFinalize {
	
	
	public ClassWithFinalize(){
		print("New Object created");
	}
	
	protected void finalize(){
		print("Object finalized");
	}
	
	public static void main(String [] args){
		ClassWithFinalize eight = new ClassWithFinalize();
		eight.finalize();
		
	}
}
