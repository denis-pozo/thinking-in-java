package org.denispozo.tutorial.thj.generics.methods;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Generics
 * Section - Generic Methods
 * Example
 */

public class GenericMethods {
	
	public <T> void f(T x) {
		print(x.getClass().getName());
	}
		
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f('c');
		gm.f(gm);
	}
}
