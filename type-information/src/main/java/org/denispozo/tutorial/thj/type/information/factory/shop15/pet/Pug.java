package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Pug extends Dog {
	
	public Pug(){ 
		super(); 
	}
	
	public Pug(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Pug> {
	
		@Override
		public Pug create() {
			return new Pug();
		}
	
		@Override
		public Pug create(String name) {
			return new Pug(name);
		}
	}
}