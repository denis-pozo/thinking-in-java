package org.denispozo.tutorial.thj.type.information;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 8
 */

public class Exercise8 {
	public static void hierarchy(Object o) {
		if(o.getClass().getSuperclass() != null) {		
			System.out.println(o.getClass() + " is a subclass of " + 
				o.getClass().getSuperclass()); 
			try {
				hierarchy(o.getClass().getSuperclass().newInstance());
			} catch(InstantiationException e) {
				System.out.println("Unable to instantiate obj");
			} catch(IllegalAccessException e) {
				System.out.println("Unable to access");
			}
		} 
	}		
	public static void main(String[] args) {
		hierarchy(new C());
	}
}

class A {}

class B extends A {}

class C extends B {}