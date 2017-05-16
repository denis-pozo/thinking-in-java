package org.denispozo.tutorial.thj.generic.erasure;

/*
 * Chapter - Generics
 * Section - The C++ Approach
 * Example
 */

class Manipulator2<T extends HasF> {
	private T obj;
	public Manipulator2(T x) {
		obj = x;
	}
	
//	Error: cannot find symbol; method f()
	public void manipulate() {
		obj.f();
	}
}


