package org.denispozo.tutorial.thj.util;

import java.util.HashSet;
import java.util.Set;

/*
 * Chapter - Generics
 * Section - A Set Utility
 * Exercise 17 - Incomplete TODO
 */

public class SetsEx17 {	
	public static <T> Set<T> union(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
    		result.addAll(b);
    		return result;
	}	
	
	

	public static <T> Set<T> intersection(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result; 
	}
	
	// Substract a subset from superset:
	public static <T> Set<T> difference(Set<T> superset, Set<T> subset){
		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	
	// Reflexive -- everything not in the intersection:
	public static <T> Set<T> complement(Set<T> a, Set<T> b){
		return difference (union(a, b), intersection(a, b));
	}
} 
