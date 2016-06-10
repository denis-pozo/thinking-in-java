package org.denispozo.tutorial.thj.holding.objects.ex10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
 * Chapter - Holding your Objects
 * Section - Iterator
 * Exercise 10
 */

public class Herd {
	
	private Random random = new Random(65);
	
	public Rodent next() {
		switch(random.nextInt(4)){
			default:
			case 0: return new Rodent();
			case 1: return new Hamster();
			case 2: return new Mouse();
			case 3: return new Gerbil();
		}
	}
	
	public static void main(String [] args) {
		/* Upcasting during addition to the array: */
		Herd herd = new Herd();
		ArrayList<Rodent> rodents = new ArrayList<Rodent>();
		
		for(int i = 0 ; i < 10 ; i++){
			rodents.add(herd.next());
		}
		
		Iterator<Rodent> iter = rodents.iterator();
		while(iter.hasNext()){
			iter.next().sniff();
		}
	}
}
