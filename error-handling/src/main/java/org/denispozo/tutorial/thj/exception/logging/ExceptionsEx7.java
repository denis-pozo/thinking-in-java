package org.denispozo.tutorial.thj.exception.logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exceptions and Logging
 * Exercise 7
 */

public class ExceptionsEx7 {
	
	private static Logger log = Logger.getLogger("ExceptionsEx7");
	
	private static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		log.severe(trace.toString());
	}
	
	public static void main(String[] args) {
		String [] chain = "Hello, my name is Denis".split(" ");

		try{
			@SuppressWarnings("unused")
			String wrong = chain[chain.length];
		}catch(ArrayIndexOutOfBoundsException e){
			logException(e);
		}
	}
}