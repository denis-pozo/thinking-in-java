package org.denispozo.tutorial.thj.interfaces;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;
import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Chapter - Interfaces
 * Section - Fields in interfaces
 * Exercise 17
 */

public class InterfaceFieldsTest {
	
	@Test
	public void proveThatTheFieldsAreStaticAndFinal() {
		print("Test of exercise 17 - proveThatTheFieldsAreStaticAndFinal");
		
		assertEquals(10, InterfaceWithFields.NUMBER);
	}
}
