package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Rodent extends Pet {
	
	public Rodent(){ 
		super(); 
	}
	
	public Rodent(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Rodent> {
	
		@Override
		public Rodent create() {
			return new Rodent();
		}
	
		@Override
		public Rodent create(String name) {
			return new Rodent(name);
		}
	}
}