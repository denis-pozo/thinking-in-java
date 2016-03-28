package org.denispozo.tutorial.thj.interfaces.abstractions;

public class SubClass extends AbstractClass {
	
	private int number = 3;
	
	public void print() {
		System.out.println("Number: " + number);
	}
	
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		SubClass subClass = new SubClass();
		// Explanation - The number printed is 0. It happens 
		// because the base class is calling the print method
		// when it gets initialized, and the subclass has not
		// been initialized yet, not even the field member.
	}

}
