package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 15
 */

public class EgyptianMau extends Cat {
	
	public EgyptianMau(){ 
		super(); 
	}
	
	public EgyptianMau(String name){
		super(name);
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.shop15.Factory<EgyptianMau> {
	
		@Override
		public EgyptianMau create() {
			return new EgyptianMau();
		}
	
		@Override
		public EgyptianMau create(String name) {
			return new EgyptianMau(name);
		}
	}
}