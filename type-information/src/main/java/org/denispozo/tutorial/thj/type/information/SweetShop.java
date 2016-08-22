package org.denispozo.tutorial.thj.type.information;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Example
 */

class Candy {
	static { print("Loading Candy"); }
}

class Gum {
	static { print("Loading Gum"); }
}

class Cookie {
	static { print("Loading Cookie"); }
}

public class SweetShop {
	public static void main(String[] args) {
		print("inside main");
		new Candy();
		print("After creating Candy");
		
		try {
		/* This example is not working properly, 
		 * since Gum is never loaded and therefore
		 * the exception is thrown always.
		 */
			Class.forName("org.denispozo.tutorial.thj.type.information.Gum");
		} catch (ClassNotFoundException cnfe) { 
			print("Couldn't find Gum");
		}
		
		print("After Class.forName(\"Gum\")");

		new Cookie();
		print("After creating Cookie");
	}
}