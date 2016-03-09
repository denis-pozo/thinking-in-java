package org.denispozo.tutorial.thj.reusing.classes;

import static org.denispozo.tutorial.thj.util.Print.*;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Chapter - Reusing Classes
 * Section - Composition Syntax
 * Exercise 1
 */

public class SecondClassTest {

	@Test
	public void simpleClassHasBeenLazyInit() {
		SecondClass secondClass = new SecondClass();
		
		// Asserts that simpleClass hasnt been initialized yet 
		assertNull(secondClass.simpleClass);
		
		print(secondClass.toString());
		
		assertTrue(secondClass.simpleClass.toString().contains("SimpleClass"));
	}
}
