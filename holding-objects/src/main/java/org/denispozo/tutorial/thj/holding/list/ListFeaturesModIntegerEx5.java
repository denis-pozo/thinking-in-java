package org.denispozo.tutorial.thj.holding.list;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * Chapter - Holding your Objects
 * Section - Lists
 * Exercise 5
 */

public class ListFeaturesModIntegerEx5 {
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> integers = listOfRandInteger(7, 10); 
		print("1: " + integers); 
		Integer inte = 123;
		integers.add(inte);
		print("2: " + integers);
		print("3: " + integers.contains(inte));
		integers.remove(inte);
		Integer p = integers.get(2);
		print("4: " + p + " " + integers.indexOf(p));
		Integer cymric = 34;
		print("5: " + integers.indexOf(cymric));
		print("6: " + integers.remove(cymric));
		print("7: " + integers.remove(p));
		print("8: " + integers);
		integers.add(3, 56);
		print("9: " + integers);
		List<Integer> sub = integers.subList(1, 4);
		print("SubList: " + sub);
		print("10: " + integers.containsAll(sub));
		Collections.sort(sub);
		print("sorted subList: " + sub);
		print("11: " + integers.containsAll(sub));
		Collections.shuffle(sub, rand);
		print("shuffled subList: " + sub);
		print("12: " + integers.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(integers);
		sub = Arrays.asList(integers.get(1), integers.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<Integer>(integers);
		copy.remove(2);
		print("14: " + copy);
		copy.removeAll(sub);
		print("15: " + copy);
		copy.set(1, 999);
		print("16: " + copy);
		copy.addAll(2, sub);
		print("17: " + copy);
		print("18: " + integers.isEmpty());
		integers.clear();
		print("19: " + integers);
		print("20: " + integers.isEmpty());
		integers.addAll(Arrays.asList(23,534,6,4));
		print("21: " + integers);
		Object [] o = integers.toArray();
		print("22: " + o[3]);
		@SuppressWarnings("unused")
		Integer[] pa = integers.toArray(new Integer[0]);
		//print("23: " + pa[3].id());
	}
	
	// method to make a List<Integer> with random values < n:
	public static List<Integer> listOfRandInteger(int length, int n) {
		Random rand = new Random();
		List<Integer> li = new ArrayList<Integer>(); 
		for(int i = 0; i < length; i++)
			li.add(rand.nextInt(n)); 		
		return li;	
	}

}
