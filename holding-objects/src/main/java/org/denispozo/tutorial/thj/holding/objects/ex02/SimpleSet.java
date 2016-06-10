package org.denispozo.tutorial.thj.holding.objects.ex02;

import java.util.HashSet;
import java.util.Set;

/*
 * Chapter - Holding your Objects
 * Section - Basic concepts
 * Exercise 2
 */
public class SimpleSet {

	public static void main(String[] args) {
		Set<Integer> c = new HashSet<Integer>();
		
		for(int i = 0 ; i < 10 ; i++){
			c.add(i);
		}
		
		System.out.println(c.add(3));
		System.out.println(c.add(8));
		
		for(Integer i : c){
			System.out.print(i + ", ");
		}
	}
}
