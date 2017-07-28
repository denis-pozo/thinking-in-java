package org.denispozo.tutorial.thj.generics.erasure.compensating;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Generics
 * Section - Creating Instances of Types
 * Example
 */

public class CreatorGeneric {
	
	public static void main(String[] args) {
		Creator c = new Creator();
		c.f();
	}
}

abstract class GenericWithCreate<T> {
	final T element;
	
	GenericWithCreate() {
		element = create();
	}
	
	abstract T create();
}

class X {}

class Creator extends GenericWithCreate<X> {
	X create() {
		return new X();
	}
	
	void f() {
		print(element.getClass().getSimpleName());
	}
}