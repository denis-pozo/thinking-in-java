package org.denispozo.tutorial.thj.holding.objects.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Holding your Objects
 * Section - Iterator
 * Exercise 11
 */

public class IteratorPrinter {
	
	@SuppressWarnings("rawtypes")
	public static void printAny(Collection c) {
		Iterator it = c.iterator();
		
		while(it.hasNext()) print(it.next() + " ");
		
		print();
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = 
			new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		LinkedList<Character> ll =
			new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));	
		HashSet<Float> hs = 
			new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
		TreeSet<Double> ts =
			new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
		LinkedHashSet<Integer> lhs =
			new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));
		printAny(al);
		printAny(ll);
		printAny(hs);
		printAny(ts);
		printAny(lhs);
	}
}
