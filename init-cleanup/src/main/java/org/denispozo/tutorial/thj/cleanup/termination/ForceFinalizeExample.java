package org.denispozo.tutorial.thj.cleanup.termination;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 11
 */

public class ForceFinalizeExample {
	
	public ForceFinalizeExample(){
		print("New Object created");
	}
	
	
	protected void finalize(){
		print("Object finalized");
	}
	
	public static void main(String [] args){
		new ForceFinalizeExample();
		System.gc();
		
	}
}
