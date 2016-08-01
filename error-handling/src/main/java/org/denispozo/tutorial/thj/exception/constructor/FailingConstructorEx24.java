package org.denispozo.tutorial.thj.exception.constructor;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Constructors
 * Exercise 24
 */

public class FailingConstructorEx24 {
	private BufferedReader in;
	
	public FailingConstructorEx24(String fileName) throws Exception {
		try{
			in = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			print("Could not find file " + fileName);
			throw e;
		} catch (Exception e) {
			try {
				in.close();
			} catch (IOException ioe) {
				print("in.close() failed");
			}
			throw e;
		}
	}
	
	public String getLine() {
		String s;
		
		try {
			s = in.readLine();
		} catch (IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	
	public void dispose() {
		
		try {
			in.close();
			print("dispose() successful");
		} catch (IOException e) {
			throw new RuntimeException("in.close() failed");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			FailingConstructorEx24 fc = new FailingConstructorEx24("AlwaysFinally.java");
			try{
				String s;
				int i = 1;
				while((s = fc.getLine()) != null) {
					print(i + " " + s);
					i++;
				}
			} catch(Exception e) {
				print("Exception caught in main()");
				e.printStackTrace(System.err);
			}	finally {
				fc.dispose();
			}
		} catch (Exception e) {
			System.err.println("FailingConstructorEx24 construction failed");
			e.printStackTrace(System.err);
		}
	}
}
