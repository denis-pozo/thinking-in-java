package org.denispozo.tutorial.thj.type.information.ifaces;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - Interfaces and type information
 * Example
 */

public class HiddenC {

	public static A makeA() { 
		return new C();
	}
}

class C implements A {
	
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
	
	@SuppressWarnings("unused")
	private void w() {
		print("private C.w()");
	}
}