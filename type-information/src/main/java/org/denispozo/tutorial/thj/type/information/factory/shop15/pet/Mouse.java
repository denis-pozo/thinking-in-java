package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Mouse extends Rodent {
	
	public Mouse(){ 
		super(); 
	}
	
	public Mouse(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Mouse> {
	
		@Override
		public Mouse create() {
			return new Mouse();
		}
	
		@Override
		public Mouse create(String name) {
			return new Mouse(name);
		}
	}
}