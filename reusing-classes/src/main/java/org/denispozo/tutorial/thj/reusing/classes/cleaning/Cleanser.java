package org.denispozo.tutorial.thj.reusing.classes.cleaning;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Inheritance Syntax
 * Exercise 2
 */

public class Cleanser {
	
	private String s = "Cleanser";
	
	public void append(String a) {
		s += a;
	}
	
	public void dilute() {
		append(" dilute()");
	}
	
	public void apply() {
		append(" apply()");
	}
	
	public void scrub() {
		append(" scrub()");
	}
	
	public String toString() {
		return s;
	}
			
	public static void main(String [] args) {
		Cleanser cleanser = new Cleanser();
		cleanser.dilute();
		cleanser.apply();
		cleanser.scrub();
		print(cleanser);
	}
}
