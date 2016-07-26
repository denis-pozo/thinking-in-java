package org.denispozo.tutorial.thj.exception.rethrow;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Rethrowing an Exception
 * Example
 */

public class Rethrowing {

	public static void f() throws Exception {
		print("originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() throws Exception {
		try{
			f();
		} catch (Exception e) {
			print("Inside g(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	
	static void h() throws Exception {
		try{
			f();
		} catch (Exception e) {
			print("Inside h(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception) e.fillInStackTrace();
		}
	}
		
	public static void main(String[] args) {
		
		try{
			g();
		} catch (Exception e) {
			print("main: printStackTrace() ");
			e.printStackTrace(System.out);
		}
		
		try{
			h();
		} catch (Exception e) {
			print("main: printStackTrace() ");
			e.printStackTrace(System.out);
		}
	}
}
