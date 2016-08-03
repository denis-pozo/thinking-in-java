package org.denispozo.tutorial.thj.strings;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Strings
 * Section - Unintended recursion
 * Exercise 2
 */

public class InfiniteRecursionEx2 {
	
	public String toString() {
		return "InfiniteRecursion address: " + super.toString() + "\n";
	}
	
	public static void main(String[] args) {
		List<InfiniteRecursionEx2> v = new ArrayList<InfiniteRecursionEx2>();
		
		for(int i = 0 ; i < 10 ; i++){
			v.add(new InfiniteRecursionEx2());
		}
		print(v);
	}
}