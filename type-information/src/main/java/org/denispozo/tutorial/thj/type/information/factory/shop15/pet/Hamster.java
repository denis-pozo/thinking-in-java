package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Hamster extends Rodent {
	
	public Hamster(){ 
		super(); 
	}
	
	public Hamster(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Hamster> {
	
		@Override
		public Hamster create() {
			return new Hamster();
		}
	
		@Override
		public Hamster create(String name) {
			return new Hamster(name);
		}
	}
}