package org.denispozo.tutorial.thj.interfaces.other;

import static org.denispozo.tutorial.thj.util.Print.*;

import org.denispozo.tutorial.thj.interfaces.InterfaceWithThreeMethods;

/*
 * Chapter - Interfaces
 * Section - Interfaces
 * Exercise 5 and 6
 */

public class InterfaceImplementation implements InterfaceWithThreeMethods {

	@Override
	public void methodOne() {
		print("Method One");
	}

//	@Override
//	void methodOne() {  Error with package access
//		print("Method One");
//	}

	@Override
	public void methodTwo() {
		print("Method Two");
	}
	
//	@Override
//	protected void methodTwo() { Error with protected access
//		print("Method Two");
//	}
	
	@Override
	public void methodThree() {
		print("Method Three");
	}
	
//	@Override
//	private void methodThree() { Error with private access
//		print("Method Three");
//	}
	
	public static void main(String [] args) {
		InterfaceWithThreeMethods iface = new InterfaceImplementation();
		iface.methodOne();
		iface.methodTwo();
		iface.methodThree();
	}

}
