package org.denispozo.tutorial.thj.reusing.classes.animal;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Reusing Classes
 * Section - Upcasting
 * Exercise 16 & 17
 */

public class Frog extends Amphibian {
	
	public Frog(String name) {
		super(name);
	}

	@Override 
	public void camouflage () {
		print("Frog - You cannot see me !!");
	}
	
	public static void main(String [] args) {
		Frog gustavo = new Frog("Gustavo");
		Amphibian bob = new Amphibian("Bob");
		
		// Upcasting
		gustavo.sayHello(bob);
		// Not upcasting
		gustavo.camouflage();
		
	}
	
	
	
}
