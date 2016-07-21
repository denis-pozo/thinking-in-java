package org.denispozo.tutorial.thj.exception;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Creating your Own Exceptions
 * Exercise 4
 */

public class ExceptionsEx4 {
	
	public static void main(String[] args) {
		
		try{
			exceptionThrower("Error in main!!");
		}catch(MyException e){
			e.displayMessage();
		}finally{
			print("Exception has been handled - finishing execution!!");
		}
	}

	private static void exceptionThrower(String string) throws MyException {
		throw new MyException(string);
	}
	
}

class MyException extends Exception{

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