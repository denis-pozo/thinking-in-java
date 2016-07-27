package org.denispozo.tutorial.thj.exception.pitfall;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Pitfall: the lost exception
 * Exercise 18
 */

public class LostMessageEx18 {

	public static void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	
	void disposeDispose() throws StupidException {
		throw new StupidException();
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		try{
			LostMessageEx18 lm = new LostMessageEx18();
			try{
				lm.f();
			} finally {
				try{ 
					lm.dispose();
				} finally {
					lm.disposeDispose();
				}
			}
		} catch (Exception e) {
			print(e);
		}
	}
}
