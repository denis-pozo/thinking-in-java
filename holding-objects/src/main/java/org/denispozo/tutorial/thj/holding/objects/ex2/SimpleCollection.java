package org.denispozo.tutorial.thj.holding.objects.ex2;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Chapter - Holding your Objects
 * Section - Basic concepts
 * Exercise 2
 */
public class SimpleCollection {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10 ; i++){
			c.add(i);
		}
		for(Integer i : c){
			System.out.print(i + ", ");
		}
	}
}
