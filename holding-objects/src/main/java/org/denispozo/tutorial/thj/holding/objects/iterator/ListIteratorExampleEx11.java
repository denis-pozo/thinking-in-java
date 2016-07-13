package org.denispozo.tutorial.thj.holding.objects.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Holding your Objects
 * Section - Iterator
 * Exercise 11
 */

public class ListIteratorExampleEx11 {
	
	public static void main(String[] args) {
		ListIterator<Integer> lIter = new ArrayList<Integer>(Arrays.asList(0,3,1,2,7,5,6,4,9,8)).listIterator();
		List<Integer> first = new ArrayList<Integer>(10);
		List<Integer> reverse = new ArrayList<Integer>(10);
		
		while(lIter.hasNext()){
			first.add(lIter.next());
		}
				
		while(lIter.hasPrevious()){
			reverse.add(lIter.previous());
		}
		
		// Alternative
		//for(int i = 0 ; i < 10 ; i ++){
		//		first.add(i);
		//}
		//
		//ListIterator<Integer> lIter = first.listIterator();
		//
		//while(lIter.hasNext()) lIter.next();
		//
		//while(lIter.hasPrevious()){
		//		reverse.add(first.get(lIter.nextIndex()-1));
		//		lIter.previous();
		//}
		
		print(first);
		print(reverse);
	}
}