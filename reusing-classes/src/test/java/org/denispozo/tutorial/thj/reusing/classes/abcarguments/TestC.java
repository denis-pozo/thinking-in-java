package org.denispozo.tutorial.thj.reusing.classes.abcarguments;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Chapter - Reusing Classes
 * Section - Initializing the base class
 * Exercise 7
 */

public class TestC {

	@Test
	public void testingWhatHappensWhenCreatingC() {
		C c = new C();
		
		assertTrue(c instanceof C);
	}
}
