package org.denispozo.tutorial.thj.access.control;

import static org.junit.Assert.assertTrue;

import org.denispozo.tutorial.thj.access.control.packages.FooClass;
import org.junit.Test;

/*
 * Chapter - Access Control
 * Section - Creating unique package names
 * Exercise 1
 */

public class FooClassInstanciationTest {
	
	@Test
	public void testInstantiationFromOutsideOfTheClassPackage() {
		FooClass foo = new FooClass();
		assertTrue(foo instanceof FooClass);
	}

}
