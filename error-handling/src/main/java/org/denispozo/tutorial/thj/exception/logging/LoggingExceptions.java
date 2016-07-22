package org.denispozo.tutorial.thj.exception.logging;

import java.util.logging.*;
import java.io.*;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exceptions and Logging
 * Example
 */

class LoggingException extends Exception {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger("LoggingException");
	
	public LoggingException() { 
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class LoggingExceptions {
	
	public static void main(String[] args) {
		
		try{
			throw new LoggingException();
		} catch (LoggingException le) {
			System.err.println("Caught " + le);
		}
		
		try{
			throw new LoggingException();
		} catch (LoggingException le) {
			System.err.println("Caught " + le);
		}
	}
}