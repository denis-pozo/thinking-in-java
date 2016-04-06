package org.denispozo.tutorial.thj.innerclasses.inandout;

import static org.denispozo.tutorial.thj.util.Print.*;

import static org.junit.Assert.*;
import org.junit.Test;

/*
 * Chapter - Inner Classes
 * Section - Using .this and .new
 * Exercise 5
 */

public class MakeInstanceOfInnerClassTest {
	
	/*
	 * Create a class with an inner class. In a separate class, make an
	 * instance of the inner class
	 * 
	 * We are reusing the class Outer and inner class Outer.Inner of exercise 1
	 */
	
	@Test
	public void makeInstanceOfInnerClassFromOuterShouldReturnInnerClassInstance() {
		print("Test: makeInstanceOfInnerClassFromOuterShouldReturnInnerClassInstance");
		
		Outer outer = new Outer();
		assertTrue(outer instanceof Outer);
		
		Outer.Inner inner = outer.new Inner();
		assertTrue(inner instanceof Outer.Inner);
	}

}
