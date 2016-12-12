package org.denispozo.tutorial.thj.type.information.ifaces.client;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import org.denispozo.tutorial.thj.type.information.ifaces.A;

/*
 * Chapter - Type Information
 * Section - Interfaces and type information
 * Example
 */

public class AnonymousImplementation {

	public static void main(String[] args) throws Exception {
		A a = AnonymousA.makeA();
		a.f();
		print(a.getClass().getName());
		
		// Oops! Reflection still allows us to call g():
		HiddenImplementation.callHiddenMethod(a,"g");
		// And even methods that are less accessible
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
		
	}
}

class AnonymousA {
	@SuppressWarnings("unused")
	public static A makeA() {
		return new A() {
			
			public void f() { 
				print("public C.f()"); 
			}
			
		
			public void g() {
				print("public C.g()");
			}
			
			void u() {
				print("package C.u()");
			}
			protected void v() {
				print("protected C.v()");
			}
			
			private void w() {
				print("private C.w()");
			}
		};
	}
}