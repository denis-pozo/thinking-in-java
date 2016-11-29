package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Manx extends Cat {
	
	public Manx(){ 
		super(); 
	}
	
	public Manx(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Manx> {
	
		@Override
		public Manx create() {
			return new Manx();
		}
	
		@Override
		public Manx create(String name) {
			return new Manx(name);
		}
	}
}