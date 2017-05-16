package org.denispozo.tutorial.thj.generic.erasure;

import java.util.ArrayList;

/*
 * Chapter - Generics
 * Section - The C++ Approach
 * Example
 */

public class HasF {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);
	}
}
