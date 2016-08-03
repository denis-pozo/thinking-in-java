package org.denispozo.tutorial.thj.strings;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Strings
 * Section - Unintended recursion
 * Example
 */

public class InfiniteRecursion {
	
	public String toString() {
		return "InfiniteRecursion address: " + this + "\n";
	}
	
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		
		for(int i = 0 ; i < 10 ; i++){
			v.add(new InfiniteRecursion());
		}
		print(v);
	}
}