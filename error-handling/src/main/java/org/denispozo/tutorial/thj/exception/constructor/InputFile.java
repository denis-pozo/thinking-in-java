package org.denispozo.tutorial.thj.exception.constructor;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Constructors
 * Example
 */

public class InputFile {

	private BufferedReader in;
	
	public InputFile(String fileName) throws Exception {
		try{
			in = new BufferedReader(new FileReader(fileName));
			// Other code that might throw exceptions
		} catch (FileNotFoundException e) {
			print("Could not open " + fileName);
			throw e;
		} catch(Exception e) {
			// All other exceptions must close it
			try{
				in.close();
			} catch(IOException ioe) {
				print("in.close() unsuccessful");
			}
			throw e;
		} finally {
			// Don't close it here !!!
		}
	}
	
	public String getLine() {
		String s;
		
		try {
			s = in.readLine();
		} catch(IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		
		return s;
	}
	
	public void dispose() {
		try {
			in.close();
			print("dispose() successful");
		} catch (IOException e2) {
			throw new RuntimeException("in.close() failed");
		}
	}
}
