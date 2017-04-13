package org.denispozo.tutorial.thj.generics.methods;

import org.denispozo.tutorial.thj.generics.interfaces.Generator;

/*
 * Chapter - Generics
 * Section - A general-purpose Generator
 * Exercise 14
 */

public class BasicGeneratorDemoEx14 {
	
	public static void main(String[] args) {
		Generator<CountedObject> gen = new BasicGenerator<CountedObject>(CountedObject.class);
		
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(gen.next());
		}
	}
}
