package org.denispozo.tutorial.thj.innerclasses.inmethodorscope;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Inner classes in methods and scopes
 * Exercise 11
 */

public class Undowncasteable {
	
	private final String name;
	
	public Undowncasteable(String name){
		this.name = name;
	}
	
	public Greeter getGreeter() {
		return new UnknownGreeter();
	}
	
	private class UnknownGreeter implements Greeter {

		@Override
		public void sayHello() {
			print("Person called "+ name + " > Hello");
			
		}
	}

	public static void main(String [] args) {
		Undowncasteable person = new Undowncasteable("Denis");
		Greeter greeter = person.getGreeter();
		
//		Undowncasteable.UnknownGreeter CANNOT BE RESOLVED TO A VARIABLE
//		if(greeter instanceof Undowncasteable.UnknownGreeter){
//			(Undowncasteable.UnknownGreeter) greeter.sayHello(); 
//		}
		greeter.sayHello();
	}
}
