package org.denispozo.tutorial.thj.exception;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - The Stack Trace
 * Example
 */

public class WhoCalled {

	static void f() {
		// Generate an exception to fill in the stack trace
		try{
			throw new Exception();
		} catch (Exception e) {
			for(StackTraceElement ste : e.getStackTrace()){
				print(ste.getMethodName());
			}
		}
	}
	
	static void g() {
		f();
	}
	
	static void h() {
		g();
	}
	
	public static void main(String[] args) {
		f();
		print("-----------------------------------");
		g();
		print("-----------------------------------");
		h();
	}
}
