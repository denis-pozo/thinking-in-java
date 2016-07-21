package org.denispozo.tutorial.thj.holding.objects.iterable;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/*
 * Chapter - Holding your objects
 * Section - The Adapter Method idiom
 * Book Example
 */

public class ModifyingArraysAsList {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer [] ia = { 1,2,3,4,5,6,7,8,9,10 };
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
		print("List before shuffling: " + list1);
		Collections.shuffle(list1, rand);
		print("List after shuffling: " + list1);
		print("array: " + Arrays.toString(ia));
		
		List<Integer> list2 = Arrays.asList(ia);
		print("Before shuffling: " + list2);
		Collections.shuffle(list2, rand);
		print("List after shuffling: " + list2);
		print("array: " + Arrays.toString(ia));
		
	}
	
}
