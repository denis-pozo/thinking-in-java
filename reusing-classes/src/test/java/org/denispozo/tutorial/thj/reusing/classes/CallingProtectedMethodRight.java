package org.denispozo.tutorial.thj.reusing.classes;

import static org.junit.Assert.assertTrue;

import org.denispozo.tutorial.thj.reusing.classes.protecting.ClassWithProtectedMethod;
import org.junit.Test; 

/*
 * Chapter - Reusing Classes
 * Section - Protected
 * Exercise 15 
 */

public class CallingProtectedMethodRight extends ClassWithProtectedMethod {

	@Test
	public void testProtectedMethodCanBeCalled() {
		CallingProtectedMethodRight object = new CallingProtectedMethodRight();
		assertTrue(object.protectedMethod()); 
	}
}
