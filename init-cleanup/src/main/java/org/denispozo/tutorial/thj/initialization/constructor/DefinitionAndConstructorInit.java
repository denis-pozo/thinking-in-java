package org.denispozo.tutorial.thj.initialization.constructor;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Exercise 2
 */
public class DefinitionAndConstructorInit {
	
	public String s1 = "Initialised at definition";
	public String s2;
	
	public DefinitionAndConstructorInit(){
		s2 = "Initialised within the construtor";
	}
	
	public static void main(String [] args){	
		DefinitionAndConstructorInit exTwo = new DefinitionAndConstructorInit();
		print(exTwo.s1);
		print(exTwo.s2);
	}
}
