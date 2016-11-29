package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Rat extends Rodent {
	
	public Rat(){ 
		super(); 
	}
	
	public Rat(String name){
		super(name);
	}

	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Rat> {
	
		@Override
		public Rat create() {
			return new Rat();
		}
	
		@Override
		public Rat create(String name) {
			return new Rat(name);
		}
	}
}