package org.denispozo.tutorial.thj.exception.logging;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exceptions and Logging
 * Example
 */

public class ExtraFeatures {

	public static void f() throws MyException2 {
		print("Throwing MyException2 from f()");
		throw new MyException2();
	}
	
	public static void g() throws MyException2 {
		print("Throwing MyException2 from g()");
		throw new MyException2("Originated in g()");
	}
	
	public static void h() throws MyException2 {
		print("Throwing MyException2 from h()");
		throw new MyException2("Originated in h()", 47);
	}
	
	public static void main(String[] args) {
		
		try{
			f();
		} catch (MyException2 me2) {
			me2.printStackTrace(System.out);
		}
		
		try{
			g();
		} catch (MyException2 me2) {
			me2.printStackTrace(System.out);
		}
		
		try{
			h();
		} catch (MyException2 me2) {
			me2.printStackTrace(System.out);
			print("e.val() = " + me2.val());
		}
	}
}

class MyException2 extends Exception {
	
	private static final long serialVersionUID = 1L;
	private int x;
	
	public MyException2() {}
	
	public MyException2(String msg) {
		super(msg);
	}
	
	public MyException2(String msg, int x) {
		super(msg);
		this.x = x;
	}
	
	public int val() {
		return x;
	}
	
	public String getMessage() {
		return "Detail Message: " + x + " " + super.getMessage();
	}
}

