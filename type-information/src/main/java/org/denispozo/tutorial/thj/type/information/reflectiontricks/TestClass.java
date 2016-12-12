package org.denispozo.tutorial.thj.type.information.reflectiontricks;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.lang.reflect.Method;

import org.denispozo.tutorial.thj.type.information.ifaces.A;

/*
 * Chapter - Type Information
 * Section - Interfaces and type information
 * Exercise 25
 */

@SuppressWarnings("unused")
public class TestClass {

	public void f() { 
		print("public TestClass.f()"); 
	}
	
	void u() {
		print("package TestClass.u()");
	}
	protected void v() {
		print("protected TestClass.v()");
	}
	
	private void w() {
		print("private TestClass.w()");
	}
}