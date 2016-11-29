package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Cat extends Pet {
	
	public Cat(){ 
		super(); 
	}
	
	public Cat(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Cat> {

		@Override
		public Cat create() {
			return new Cat();
		}

		@Override
		public Cat create(String name) {
			return new Cat(name);
		}
	}
	
}