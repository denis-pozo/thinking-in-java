package org.denispozo.tutorial.thj.holding.map;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Chapter - Holding your Objects
 * Section - Map
 * Exercise 18
 */

public class HashOrderCheckerEx18 {
	
	public static void main(String [] args) {
		Map<Integer, String> numbersA = new HashMap<Integer, String>();
		
		numbersA.put(0, "Zero");
		numbersA.put(1, "One");
		numbersA.put(2, "Two");
		numbersA.put(3, "Three");
		numbersA.put(4, "Four");
		numbersA.put(5, "Five");
		numbersA.put(6, "Six");
		numbersA.put(7, "Seven");
		numbersA.put(8, "Eight");
		numbersA.put(9, "Nine");
		numbersA.put(10, "Ten");
				
		print(numbersA);
		
		Map<Integer, String> numbersB = new LinkedHashMap<Integer, String>();
		for(Integer i : numbersA.keySet()){
			numbersB.put(i, numbersA.get(i));			
		}
		
		print(numbersB);
	}
}
