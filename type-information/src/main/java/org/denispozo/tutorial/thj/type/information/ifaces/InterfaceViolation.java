package org.denispozo.tutorial.thj.type.information.ifaces;

/*
 * Chapter - Type Information
 * Section - Interfaces and type information
 * Example
 */

public class InterfaceViolation {
	
	public static void main(String[] args) {
		A a = new B();
		a.f();
		//a.g(); Compile error
		System.out.println(a.getClass().getName());
		if(a instanceof B){
			B b = (B) a;
			b.g();
		}
	}

	
}

class B implements A {
	public void f() {}
	public void g() {}
}