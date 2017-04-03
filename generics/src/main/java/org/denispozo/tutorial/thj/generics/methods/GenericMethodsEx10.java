package org.denispozo.tutorial.thj.generics.methods;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Generics
 * Section - Generic Methods
 * Exercise 10
 */

public class GenericMethodsEx10 {
	
	public <T,K,V> void f(T x, K k, Boolean v) {
		printnr(x.getClass().getName() + " ");
		printnr(k.getClass().getName() + " ");
		print(v.getClass().getName());
	}
		
	public static void main(String[] args) {
		GenericMethodsEx10 gm = new GenericMethodsEx10();
		
		gm.f("", 1, true);
		gm.f(gm, gm, false);
	}
}
