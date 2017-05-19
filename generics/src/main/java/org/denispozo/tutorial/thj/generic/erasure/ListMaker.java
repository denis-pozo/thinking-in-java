package org.denispozo.tutorial.thj.generic.erasure;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Generics
 * Section - The Action of Boundaries
 * Example
 */

public class ListMaker<T> {
	
	List<T> create() {
		return new ArrayList<T>();
	}
	
	public static void main(String[] args) {
		
		ListMaker<String> listMaker = 
				new ListMaker<String>();
		
		@SuppressWarnings("unused")
		List<String> stringList = listMaker.create();
	} 
}