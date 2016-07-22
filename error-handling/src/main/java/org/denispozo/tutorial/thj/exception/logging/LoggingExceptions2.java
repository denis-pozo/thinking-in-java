package org.denispozo.tutorial.thj.exception.logging;

import java.util.logging.*;
import java.io.*;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exceptions and Logging
 * Example
 */

public class LoggingExceptions2 {

	private static Logger logger = Logger.getLogger("LoggingExceptions2");
	
	static void logException(Exception e) { 
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
	public static void main(String[] args) {
		
		try{
			throw new NullPointerException();
		} catch (NullPointerException npe) {
			logException(npe);
		}
	}
}