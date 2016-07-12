package org.denispozo.tutorial.thj.holding.objects.ex19;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Chapter - Holding your Objects
 * Section - Map
 * Exercise 10
 */

public class SetsOrderChecker {
	
	public static void main(String [] args) {
		Set<String> numbersA = new HashSet<String>();
		
		numbersA.add("Zero");
		numbersA.add("One");
		numbersA.add("Two");
		numbersA.add("Three");
		numbersA.add("Four");
		numbersA.add("Five");
		numbersA.add("Six");
		numbersA.add("Seven");
		numbersA.add("Eight");
		numbersA.add("Nine");
		numbersA.add("Ten");
				
		print(numbersA);
		
		Set<String> numbersB = new LinkedHashSet<String>();
		for(String number : numbersA){
			numbersB.add(number); 			
		}
		
		print(numbersB);
	}
}
