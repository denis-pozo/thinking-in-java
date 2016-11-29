package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class Cymric extends Manx {
	
	public Cymric(){ 
		super(); 
	}
	
	public Cymric(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<Cymric> {

		@Override
		public Cymric create() {
			return new Cymric();
		}
	
		@Override
		public Cymric create(String name) {
			return new Cymric(name);
		}
	}
}