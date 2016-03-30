package org.denispozo.tutorial.thj.interfaces.abstractions;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Chapter - Interfaces
 * Section - Abstract classes and methods
 * Exercise 4
 */

public class DadsAndSonsTest {
	
	public static void staticMethod(Dad dad) {
		((Son)dad).method();
	}
	
	public static void staticMethod(StepDad dad) {
		dad.method();
	}

	@Test
	public void testMethodWorks() {
		staticMethod(new Son());
		
		assertTrue(true);
	}
	
	@Test
	public void testStepMethodWorks() {
		staticMethod(new StepSon());
		
		assertTrue(true);
		
	}

}
