package org.denispozo.tutorial.thj.interfaces.abstractions;

import static org.denispozo.tutorial.thj.util.Print.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * Chapter - Interfaces
 * Section - Abstract classes and methods
 * Exercise 2
 */

public class AbstractClassTest {
	
	@Test
	public void abstractClassCannotBeInitialized() {
		print("abstractClassCannotBeInitialized");
		
		//AbstractClass abstractClass = new AbstractClass(); 
		//Cannot instantiate the type AbstractClass
		assertTrue(true);
	}

}
