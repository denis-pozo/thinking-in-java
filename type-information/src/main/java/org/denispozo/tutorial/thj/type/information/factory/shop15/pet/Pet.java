package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Pet extends Individual {
	
	public Pet(){ 
		super(); 
	}
	
	public Pet(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Pet> {
	
		@Override
		public Pet create() {
			return new Pet();
		}
	
		@Override
		public Pet create(String name) {
			return new Pet(name);
		}
	}
}