package org.denispozo.tutorial.thj.interfaces.rodents.withabstract;

import java.util.Random;

/*
 * Chapter - Interfaces
 * Section - Abstract classes and methods
 * Exercise 1
 */

public class Herd {
	
	private Random random = new Random(65);
	
	public Rodent next() {
		switch(random.nextInt(3)){
			default:
			case 0: return new Gerbil();
			case 1: return new Hamster();
			case 2: return new Mouse();
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
