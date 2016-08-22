package org.denispozo.tutorial.thj.type.information;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Example
 */

class CandyEx7 {
	static { print("Loading Candy"); }
}

class GumEx7 {
	static { print("Loading Gum"); }
}

class CookieEx7 {
	static { print("Loading Cookie"); }
}

public class SweetShopEx7 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("Usage: sweetName");
			System.exit(0);
		}
		
		Class c = null;
		try {
			c = Class.forName("org.denispozo.tutorial.thj.type.information." + args[0]);
			print("Enjoy your " + args[0]);
		} catch(ClassNotFoundException e) {
			print("Couldn't find " + args[0]);
		}
	}
}