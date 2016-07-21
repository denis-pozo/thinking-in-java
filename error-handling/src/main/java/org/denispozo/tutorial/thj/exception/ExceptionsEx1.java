package org.denispozo.tutorial.thj.exception;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Creating your Own Exceptions
 * Exercise 1
 */

public class ExceptionsEx1 {
	
	public static void main(String[] args) {
	
		try{
			exceptionThrower("Error in main!!");
		}catch(Exception e){
			print(e.getMessage());
		}finally{
			print("Exception has been handled - finishing execution!!");
		}
	}

	private static void exceptionThrower(String string) throws Exception {
		throw new Exception(string);
	}
}