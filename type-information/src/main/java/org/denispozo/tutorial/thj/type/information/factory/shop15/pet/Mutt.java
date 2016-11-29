package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Mutt extends Dog {
	
	public Mutt(){ 
		super(); 
	}
	
	public Mutt(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Mutt> {
	
		@Override
		public Mutt create() {
			return new Mutt();
		}
	
		@Override
		public Mutt create(String name) {
			return new Mutt(name);
		}
	}
}