package org.denispozo.tutorial.thj.reusing.classes.finalpack;

import org.denispozo.tutorial.thj.reusing.classes.animal.Amphibian;

/*
 * Chapter - Reusing Classes
 * Section - Final Keyword
 * Exercise 19 
 */
public class BlankFinal {
	
	private final Amphibian bob;
	
	public BlankFinal() {
		// Compiler throws an error if we remove the line below
		bob = new Amphibian("bob");
	}
	
	public Amphibian getAmphibian() {
		return bob;
	}
	
	public static void main(String [] args) {
		BlankFinal bf = new BlankFinal();
		bf.getAmphibian().camouflage();
	}

}
