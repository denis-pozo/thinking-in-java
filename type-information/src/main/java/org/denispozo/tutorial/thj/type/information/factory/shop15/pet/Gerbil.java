package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Gerbil extends Rodent {
	
	public Gerbil(){ 
		super(); 
	}
	
	public Gerbil(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Gerbil> {
	
		@Override
		public Gerbil create() {
			return new Gerbil();
		}
	
		@Override
		public Gerbil create(String name) {
			return new Gerbil(name);
		}
	}
}