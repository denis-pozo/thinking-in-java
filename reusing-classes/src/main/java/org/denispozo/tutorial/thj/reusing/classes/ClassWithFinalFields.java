package org.denispozo.tutorial.thj.reusing.classes;

import static org.denispozo.tutorial.thj.util.Print.*; 

import java.util.*;

/*
 * Chapter - Reusing Classes
 * Section - Upcasting
 * Exercise 18 
 */

public class ClassWithFinalFields {
	private static Random random = new Random(44);
	private static final int STATIC_FINAL = random.nextInt(20);
	private final int finalField = random.nextInt(20);
	
	public void printFinalFields() {
		print("Final Fields:");
		print("Static - " + STATIC_FINAL);
		print("Non-Static - " + finalField);
	}
	
	public static void main(String [] args) {
		ClassWithFinalFields object1 = new ClassWithFinalFields();
		ClassWithFinalFields object2 = new ClassWithFinalFields();
		ClassWithFinalFields object3 = new ClassWithFinalFields();
		ClassWithFinalFields object4 = new ClassWithFinalFields();
		object1.printFinalFields();
		object2.printFinalFields();
		object3.printFinalFields();
		object4.printFinalFields();
	}
}
