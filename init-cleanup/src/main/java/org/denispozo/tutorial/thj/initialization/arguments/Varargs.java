package org.denispozo.tutorial.thj.initialization.arguments;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 19
 */

public class Varargs {

	public Varargs(String ... strings){
		for(String s : strings){
			print(s);
		}
	}
	
	public static void main(String [] args){
		Varargs v1 = new Varargs("Hello ", "What " , "is ", "going ", "on?");
		String [] s = new String[]{"Hey, ", "Whats ", "up?"};
		Varargs v2 = new Varargs(s);
		print(v1.toString());
		print(v2.toString());
	}
}
