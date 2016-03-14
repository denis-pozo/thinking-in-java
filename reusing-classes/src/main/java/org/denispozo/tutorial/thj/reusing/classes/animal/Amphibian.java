package org.denispozo.tutorial.thj.reusing.classes.animal;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Reusing Classes
 * Section - Upcasting
 * Exercise 16 
 */

public class Amphibian {
	
	private String name;
	
	public Amphibian(String name) {
		this.name = name;
	}
	
	public void sayHello(Amphibian amph) {
		print("Amphibian " + name + " - Hey my friend, " + amph.getName());
	}

	public void camouflage () {
		print("Amphibian - You cannot see me !!");
	}
	
	public String getName() {
		return name;
	}
}
