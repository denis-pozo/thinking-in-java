package org.denispozo.tutorial.thj.exception.constructor;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Constructors
 * Example
 */

public class Cleanup {

	public static void main(String[] args) {
		
		try{
			InputFile in = new InputFile("Cleanup.java");
			try { 
				String s;
				while((s = in.getLine()) != null){
					print(s);
				}
			} catch (Exception e) {
				print("Caught Exception in main");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch(Exception e) {
			print("InputFile construction failed");
		}
	}
}
