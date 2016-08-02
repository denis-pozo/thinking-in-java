package org.denispozo.tutorial.thj.exception.console;

import java.io.FileInputStream;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Passing exceptions to the console
 * Example
 */

public class MainException {
	
	// Pass all exceptions to the console:
	public static void main(String[] args) throws Exception {
		// Open the file:
		FileInputStream file = new FileInputStream("MainException.java");
		// Use the file
		// Close the file
		file.close();
	}
}