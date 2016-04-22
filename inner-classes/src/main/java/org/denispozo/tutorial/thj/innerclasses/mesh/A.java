package org.denispozo.tutorial.thj.innerclasses.mesh;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Inner Classes
 * Section - Why inner classes?
 * Exercise 23
 */

public class A {
	
	U makeU() {
		return new U() {

			@Override
			public void one() {
				print("Anonymous U one()");
				
			}

			@Override
			public void two() {
				print("Anonymous U two()");				
			}

			@Override
			public void three() {
				print("Anonymous U three()");				
			}
		};
	}

}
