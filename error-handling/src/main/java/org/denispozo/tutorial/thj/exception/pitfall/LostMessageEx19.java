package org.denispozo.tutorial.thj.exception.pitfall;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Pitfall: the lost exception
 * Exercise 19
 */

public class LostMessageEx19 {

	public void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	
	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	// Option 1
	public static void main(String[] args) {
		LostMessageEx19 lm = new LostMessageEx19();
		
		try{
			lm.f();
		} catch (Exception e) {
			print(e);
		} finally {
			try {
				lm.dispose();
			} catch (HoHumException e) {
				print(e);
			}
		}
	}
	
	// Option 2
//	public static void main(String[] args) {
//		try {
//			LostMessageEx19 lmf = new LostMessageEx19();
//			try {
//				lmf.f();
//			} catch(Exception e) {
//				System.out.println(e);
//			} finally {
//				lmf.dispose();
//			}
//
//		} catch(Exception e) {
//			System.out.println(e);
//		}
//	}
}
