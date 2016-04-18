package org.denispozo.tutorial.thj.innerclasses.nested;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Nested Classes
 * Exercise 18
 */

public class WithInnerNestedClass {
	
	private static class NestedClass implements InnerClass {
		private static int i = 11;
		public int value() {
			return i++;
		}
	}
	
	public static InnerClass innerClass() {
		return new NestedClass();
	}

	public static void main(String [] args) {
		InnerClass inner = innerClass();
		print("Value of the inner class: " + inner.value());
		print("Value of the inner class: " + inner.value());
		print("Value of the inner class: " + inner.value());
		print("Value of the inner class: " + inner.value());
	}
}

interface InnerClass { int value(); }


