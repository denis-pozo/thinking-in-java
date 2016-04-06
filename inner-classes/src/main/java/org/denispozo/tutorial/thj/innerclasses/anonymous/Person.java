package org.denispozo.tutorial.thj.innerclasses.anonymous;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Anonymous inner classes
 * Exercise 13
 */

public class Person {
	
	private final String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public Greeter greeter() {
		return new Greeter() {
			@Override
			public void sayHello() {
				print("Person called "+ name + " > Hello");
				
			}
		};
	}

	public static void main(String [] args) {
		Person person = new Person("Denis");
		person.greeter().sayHello();
	}
}
