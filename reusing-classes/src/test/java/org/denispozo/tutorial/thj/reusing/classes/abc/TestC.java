package org.denispozo.tutorial.thj.reusing.classes.abc;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Chapter - Reusing Classes
 * Section - Inheritance Syntax
 * Exercise 5
 */

public class TestC {

	@Test
	public void testingWhatHappensWhenCreatingC() {
		C c = new C();
		
		assertTrue(c instanceof C);
	}
}
