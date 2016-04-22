package org.denispozo.tutorial.thj.initialization.arguments;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 20
 */

public class VarargsInMain {
	
	public static void main(String ...strings){
		for(String s : strings){
			print(s);
		}
	}

}
