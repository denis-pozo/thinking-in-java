package org.denispozo.tutorial.thj.type.information;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 10
 */

public class Exercise10 {
	
	public static void main(String[] args) {
		char [] array = new char[10];
		System.out.println("Superclass of char[] array: " +
							array.getClass().getSuperclass());
		System.out.println("char[] array instanceof Object: " +
				(array instanceof Object));
	}
}
