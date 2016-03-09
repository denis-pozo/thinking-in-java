package org.denispozo.tutorial.thj.reusing.classes.art;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Chapter - Reusing Classes
 * Section - Inheritance Syntax
 * Exercise 4
 */

public class BaseClassesConstructorTest {
	
	@Test
	public void creationOfDerivedClassObjectCreatesBaseObjectFirst() {
		Drawing drawing = new Drawing();
		
		assertTrue(drawing instanceof Drawing);
	}

}
