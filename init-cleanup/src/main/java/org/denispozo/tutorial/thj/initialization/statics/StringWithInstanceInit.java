package org.denispozo.tutorial.thj.initialization.statics;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 15
 */

public class StringWithInstanceInit {
	
	public static String s;
	
	{
		s = "Static string";
	}
	
	public StringWithInstanceInit(){
		print(s);
	}

	public static void main(String[] args) {
		
		StringWithInstanceInit swii = new StringWithInstanceInit(); 
		swii.toString();
	}
}
