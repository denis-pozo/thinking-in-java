package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Dog extends Pet {
	
	public Dog(){ 
		super(); 
	}
	
	public Dog(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Dog> {
	
		@Override
		public Dog create() {
			return new Dog();
		}
	
		@Override
		public Dog create(String name) {
			return new Dog(name);
		}
	}
}