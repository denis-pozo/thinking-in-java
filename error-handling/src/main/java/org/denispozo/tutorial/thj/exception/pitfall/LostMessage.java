package org.denispozo.tutorial.thj.exception.pitfall;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Pitfall: the lost exception
 * Example
 */

public class LostMessage {

	public static void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	
	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		try{
			LostMessage lm = new LostMessage();
			try{
				lm.f();
			} finally {
				lm.dispose();
			}
		} catch (Exception e) {
			print(e);
		}
	}
}
