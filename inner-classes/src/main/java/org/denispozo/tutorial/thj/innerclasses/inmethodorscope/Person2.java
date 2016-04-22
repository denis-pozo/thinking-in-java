package org.denispozo.tutorial.thj.innerclasses.inmethodorscope;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Inner Classes
 * Section - Inner classes in methods and scopes
 * Exercise 10
 */

public class Person2 {
	
	private final String name;
	
	public Person2(String name){
		this.name = name;
	}
	
	public Greeter getGreeter() {
		if(name.equals("Denis")){
			class PGreeter implements Greeter {

				@Override
				public void sayHello() {
					print("Hello > Person called "+ name);
					
				}
			}

			return new PGreeter();
		}
		return null;
	}

	public static void main(String [] args) {
		Person2 person = new Person2("Denis");
		if(person.getGreeter() != null) person.getGreeter().sayHello();
	}
}
