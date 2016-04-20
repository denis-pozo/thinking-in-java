package org.denispozo.tutorial.thj.innerclasses.inheritinner;

/*
 * Chapter - Inner Classes
 * Section - Inheriting from inner classes
 * Exercise 26
 */

public class InheritInner extends WithInner.Inner {
	
	//! InheritInner() {} won't compile
	InheritInner (WithInner wi) {
		wi.super(10);
	}
	
	public static void main(String [] args){
		WithInner wi = new WithInner();
		@SuppressWarnings("unused")
		InheritInner ii = new InheritInner(wi);
	}
}

class WithInner {
	@SuppressWarnings("unused")
	private int i;
	
	class Inner {
		Inner(int a) {
			i = a;
			
		}
	}
}
