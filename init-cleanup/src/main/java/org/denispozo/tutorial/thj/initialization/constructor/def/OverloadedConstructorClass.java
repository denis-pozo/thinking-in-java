package org.denispozo.tutorial.thj.initialization.constructor.def;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 4
 */

public class OverloadedConstructorClass {
	
	public OverloadedConstructorClass(){
		print("Hey guys, how are you doing?");
	}
	
	public OverloadedConstructorClass(String s){
		print(s);
	}
	
	public static void main(String [] args){		
		OverloadedConstructorClass exThreeA = new OverloadedConstructorClass();
		print(exThreeA.toString());
		
		OverloadedConstructorClass exThreeB = new OverloadedConstructorClass("How are you doing guys?");
		print(exThreeB.toString());
		
	}
}
