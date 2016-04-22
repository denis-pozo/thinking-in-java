package org.denispozo.tutorial.thj.reusing.classes;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Initializing the base class
 * Exercise 23 
 */

class A {
	static int j = printInit("A.j initialized");
	static int printInit(String s) {
		print(s);
		return 1;
	}
	
	A () {
		print("A() constructor");
	}
}

class B extends A {
	static int k = printInit("B.k initialized");
	B() {
		print("B() constructor");
	}
}

class C {
	static int n = printInitC("C.n initialized");
	static A a = new A();
	C() {
		print("C() constructor");
	}
	
	static int printInitC(String s) {
		print(s);
		return 98;
	}
}

class D {
	
	D() { 
		print("D() constructor");
	}
}

public class LoadingClass extends B {
	static int i = printInit("LoadingClass.i initialized");
	
	LoadingClass() {
		print("LoadingClass() constructor");
	}
	
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		// accessing static main causes loading (and init) of A, B and LoadingClass
		print("hello");
		// call constructors from loaded classes;
		LoadingClass lc = new LoadingClass();
		// call to static fields loads and inits C:
		print(C.a);
		// call to constructor loads D:
		D d = new D();
	}
}
