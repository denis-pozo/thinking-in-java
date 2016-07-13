package org.denispozo.tutorial.thj.holding.objects.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
 * Chapter - Holding your Objects
 * Section - Iterator
 * Exercise 10
 */

public class HerdEx10 {
	
	private Random random = new Random(65);
	
	public RodentEx10 next() {
		switch(random.nextInt(4)){
			default:
			case 0: return new RodentEx10();
			case 1: return new HamsterEx10();
			case 2: return new MouseEx10();
			case 3: return new GerbilEx10();
		}
	}
	
	public static void main(String [] args) {
		/* Upcasting during addition to the array: */
		HerdEx10 herd = new HerdEx10();
		ArrayList<RodentEx10> rodents = new ArrayList<RodentEx10>();
		
		for(int i = 0 ; i < 10 ; i++){
			rodents.add(herd.next());
		}
		
		Iterator<RodentEx10> iter = rodents.iterator();
		while(iter.hasNext()){
			iter.next().sniff();
		}
	}
}
