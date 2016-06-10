package org.denispozo.tutorial.thj.holding.objects.ex10;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Holding your Objects
 * Section - Iterator
 * Exercise 10
 */

public class Hamster extends Rodent {
	
	public Hamster() {
		print("Hamster()");
	}
	
	public void gnaw() {
		print("Hamster.gnaw()");
	}
	
	public void sniff() {
		print("Hamster.sniff()");
	}
}
