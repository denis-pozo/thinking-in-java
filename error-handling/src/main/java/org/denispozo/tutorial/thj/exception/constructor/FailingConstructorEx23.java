package org.denispozo.tutorial.thj.exception.constructor;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Constructors
 * Exercise 23
 */

public class FailingConstructorEx23 {
	
	private Integer [] ia = new Integer[2];
	
	private static Disposable d0;
	@SuppressWarnings("unused")
	private static Disposable d1;
	
	public FailingConstructorEx23() throws Exception {
		try{
			d0 = new Disposable();
			try{
				ia[2] = 2;
				try{
					d1 = new Disposable();
				} catch (Exception e) {
					print("Caught exception in inner try loop");
					e.printStackTrace(System.err);
					print("Failed to create d1");
				}
			} catch (Exception e) {
				print("Caught e in the middle try loop");
				e.printStackTrace(System.err);
				print("Disposing d0");
				d0.dispose();
			}
		} catch (Exception e) {
			print("Caught e in outer try loop");
			e.printStackTrace(System.err);
			print("Failed to create d0");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			FailingConstructorEx23 fc = new FailingConstructorEx23();
		} catch (Exception e) {
			System.err.println("Caught Exception in main()");
			e.printStackTrace(System.err);
		}
	}


}

class Disposable {
	private static int counter = 0;
	private int id = counter++;
	private boolean disposed;
	
	Disposable() {
		disposed = false;
	}
	
	void dispose() {
		disposed = true;
	}
	
	String checkStatus() {
		return (id + " " + (disposed ? "disposed": "not disposed"));
	}
}