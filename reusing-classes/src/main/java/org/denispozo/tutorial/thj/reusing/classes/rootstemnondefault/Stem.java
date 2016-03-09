package org.denispozo.tutorial.thj.reusing.classes.rootstemnondefault;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Reusing Classes
 * Section - Initializing the base class
 * Exercise 8 
 */

public class Stem extends Root {
	
	@SuppressWarnings("unused")
	private Component1 component1;
	@SuppressWarnings("unused")
	private Component2 component2;
	@SuppressWarnings("unused")
	private Component3 component3;
	
	public Stem(int i) {
		super(i);
		print("Stem constructor");
		component1 = new Component1(i);
		component2 = new Component2(i);
		component3 = new Component3(i);
	}
	
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		Stem stem = new Stem(837);
	}
	
}
