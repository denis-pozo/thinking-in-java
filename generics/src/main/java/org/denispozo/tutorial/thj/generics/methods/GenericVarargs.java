package org.denispozo.tutorial.thj.generics.methods;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Generics
 * Section - Varargs and generic methods
 * Example
 */

public class GenericVarargs {
	
	@SafeVarargs
	public static <T> List<T> makeList(T ... args){
		List<T> list = new ArrayList<T>();
		for(T item : args) {
			list.add(item);
		}
		return list;
	}
		
	public static void main(String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls = makeList("A", "B", "C");
		System.out.println(ls);
		ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
		System.out.println(ls);
	}
}
