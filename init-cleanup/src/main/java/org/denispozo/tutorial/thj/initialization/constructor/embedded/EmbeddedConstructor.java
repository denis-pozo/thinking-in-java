package org.denispozo.tutorial.thj.initialization.constructor.embedded;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 9
 */
public class EmbeddedConstructor {
	
	
	public EmbeddedConstructor(){
		this("Hello");
	}
	
	public EmbeddedConstructor(String s){
		print("Second constructor has been called!!!");
	}
	
	public void finish(String s){
		print(s);
	}
	
	public static void main(String [] args){
		EmbeddedConstructor eight = new EmbeddedConstructor();
		eight.finish("The End");
		
	}
}
