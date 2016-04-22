package org.denispozo.tutorial.thj.polymorphism.rodent.two;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Inheritance and Cleanup
 * Exercise 14
 */

public class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++; 
	public Shared() { print("Creating " + this); }
	public void addRef() { refcount++; }
	public String toString() { return "Shared " + id; }
	public void showRefcount() { print("refcount = " + refcount); }		
}