package org.denispozo.tutorial.thj.generics.methods;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;
import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

/*
 * Chapter - Generics
 * Section - Generic Methods
 * Exercise 9
 */

public class GenericMethodsEx9 {
	
	public <T,K,V> void f(T x, K k, V v) {
		printnr(x.getClass().getName() + " ");
		printnr(k.getClass().getName() + " ");
		print(v.getClass().getName());
	}
		
	public static void main(String[] args) {
		GenericMethodsEx9 gm = new GenericMethodsEx9();
		
		gm.f("", 1, true);
		gm.f(gm, gm, gm);
	}
}
