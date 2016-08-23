package org.denispozo.tutorial.thj.type.information.generics;

/*
 * Chapter - Type Information
 * Section - Generic Class References
 * Example
 */

public class GenericClassReferences {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Class<?> intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		intClass = double.class;
		// genericIntClass = double.class; // Illegal
	}
}