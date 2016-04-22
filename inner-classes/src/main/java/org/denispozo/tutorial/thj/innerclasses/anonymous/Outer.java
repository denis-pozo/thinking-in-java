package org.denispozo.tutorial.thj.innerclasses.anonymous;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Inner Classes
 * Section - Anonymous inner classes
 * Exercise 12
 */

public class Outer {
	
	private int oi = 1;
	
	private void hi() {
		print("Outer hi");
	}
	
	public Inner inner() {
		return new Inner() {
			public void modifyOuter() {
				oi *= 2;
				hi();
			}
		};
	}
	
	public void showOi(){
		print(oi);
	}
	
	public static void main(String [] args) {
		Outer outer = new Outer();
		outer.showOi();
		outer.inner().modifyOuter();
		outer.showOi();
	}
}


interface Inner {
	void modifyOuter();
}