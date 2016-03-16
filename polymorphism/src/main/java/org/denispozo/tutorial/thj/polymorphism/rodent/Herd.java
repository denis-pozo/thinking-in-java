package org.denispozo.tutorial.thj.polymorphism.rodent;

import java.util.Random;

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 8
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
		Rodent [] rodents = new Rodent[10];
		
		for(int i = 0 ; i < rodents.length ; i ++) {
			rodents[i] = herd.next();
		}
		
		for(Rodent rodent : rodents) {
			rodent.sniff();
			rodent.gnaw();
		}
	}
}
