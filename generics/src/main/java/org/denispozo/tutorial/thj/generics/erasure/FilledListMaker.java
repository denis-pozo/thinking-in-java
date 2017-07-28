package org.denispozo.tutorial.thj.generics.erasure;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Generics
 * Section - The Action of Boundaries
 * Example
 */

public class FilledListMaker<T> {
	
	List<T> create(T t, int n) {
		List<T> result = new ArrayList<T>();
		for(int i = 0 ; i < n ; i++){
			result.add(t);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		FilledListMaker<String> listMaker = 
				new FilledListMaker<String>();
		
		List<String> list = listMaker.create("Hello", 4);
		System.out.println(list);
	}
}