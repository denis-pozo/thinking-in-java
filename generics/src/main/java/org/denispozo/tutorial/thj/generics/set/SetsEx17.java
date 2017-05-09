package org.denispozo.tutorial.thj.generics.set;

import static org.denispozo.tutorial.thj.generics.Watercolors.BRILLIANT_RED;
import static org.denispozo.tutorial.thj.generics.Watercolors.BURNT_UMBER;
import static org.denispozo.tutorial.thj.generics.Watercolors.CERULEAN_BLUE_HUE;
import static org.denispozo.tutorial.thj.generics.Watercolors.VIDRIAN_HUE;
import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import org.denispozo.tutorial.thj.generics.Watercolors;

/*
 * Chapter - Generics
 * Section - A Set Utility
 * Exercise 17
 */

public class SetsEx17 {	
	
	public static <T> Set<T> union(Set<T> a, Set<T> b){
		print("Union - HashSet");
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
    	return result;
	}
	
	public static <T extends Enum<T>> Set<T> union(EnumSet<T> a, EnumSet<T> b){
		print("Union - Clone");
		Set<T> result = a.clone();
    	result.addAll(b);
    	return result;
	}
	
	public static <T> Set<T> intersection(Set<T> a, Set<T> b){
		print("Intersection - HashSet");
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result; 
	}
	
	public static <T extends Enum<T>> Set<T> intersection(EnumSet<T> a, EnumSet<T> b){
		print("Intersection - Clone");
		Set<T> result = a.clone();
		result.retainAll(b);
		return result; 
	}
	
	// Substract a subset from superset:
	public static <T> Set<T> difference(Set<T> superset, Set<T> subset){
		print("difference - HashSet");
		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	
	// Substract a subset from superset: (with clone)
	public static <T extends Enum<T>> Set<T> difference(EnumSet<T> superset, EnumSet<T> subset){
		print("Difference - clone");
		Set<T> result = superset.clone();
		result.removeAll(subset);
		return result;
	}
	
	// Reflexive -- everything not in the intersection:
	public static <T> Set<T> complement(Set<T> a, Set<T> b){
		return difference (union(a, b), intersection(a, b));
	}
	
	// Reflexive -- everything not in the intersection: (with clone)
	public static <T extends Enum<T>> Set<T> complement(EnumSet<T> a, EnumSet<T> b){
		return difference (union(a, b), intersection(a, b));
	}
		
	public static void main(String[] args) {
		
		EnumSet<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIDRIAN_HUE);
		EnumSet<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
		
		print("set1: " + set1);
		print("set2: " + set2);
		print("union(set1, set2): " + union(set1, set2));
		
		Set<Watercolors> subset = intersection(set1, set2);
		print("intersection(set1, set2): " + subset);
		print("difference(set1, subset): " + difference(set1, subset));
		print("difference(set2, subset): " + difference(set2, subset));
		print("complement(set1, set2): " + complement(set1, set2));
		
	}
} 
