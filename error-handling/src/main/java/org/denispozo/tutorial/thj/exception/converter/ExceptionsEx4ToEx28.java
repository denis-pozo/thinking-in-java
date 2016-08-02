package org.denispozo.tutorial.thj.exception.converter;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Converting checked to unchecked exceptions
 * Exercise 28
 */

public class ExceptionsEx4ToEx28 {
	
	public static void main(String[] args) {
		exceptionThrower("Error in main!!");
	}

	private static void exceptionThrower(String string) throws MyException {
		throw new MyException(string);
	}
	
}

class MyException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	String message;
	
	public MyException(){
		message = "Default Exception Message";
	}
	
	public MyException(String message){
		this.message = message;
	}
	
	public void displayMessage(){
		print(message);
	}
}