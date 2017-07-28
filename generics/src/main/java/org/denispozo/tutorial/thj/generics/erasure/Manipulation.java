package org.denispozo.tutorial.thj.generics.erasure;

/*
 * Chapter - Generics
 * Section - The C++ Approach
 * Example
 */

public class Manipulation {
	
	public static void main(String[] args) {
		HasF hasF = new HasF();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hasF);
		manipulator.manipulate();
	}
}

class Manipulator<T> {
	@SuppressWarnings("unused")
	private T obj;
	public Manipulator(T x) {
		obj = x;
	}
	
//	Error: cannot find symbol; method f()
	public void manipulate() {
//		obj.f();
	}
	
}


