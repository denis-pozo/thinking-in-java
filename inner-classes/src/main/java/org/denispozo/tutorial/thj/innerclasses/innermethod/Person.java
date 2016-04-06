package org.denispozo.tutorial.thj.innerclasses.innermethod;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Inner classes in methods and scopes
 * Exercise 9
 */

public class Person {
	
	private final String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public Greeter getGreeter() {
		
		class PGreeter implements Greeter {

			@Override
			public void sayHello() {
				print("PrivateOuter with name: "+ name + " > Hello");
				
			}
		}

		return new PGreeter();
	}

	public static void main(String [] args) {
		Person person = new Person("Denis");
		person.getGreeter().sayHello();
	}
}
