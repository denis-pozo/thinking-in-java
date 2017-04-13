package org.denispozo.tutorial.thj.generics.methods;

import org.denispozo.tutorial.thj.generics.interfaces.Generator;

/*
 * Chapter - Generics
 * Section - A general-purpose Generator
 * Example
 */

public class BasicGeneratorDemo {
	
	public static void main(String[] args) {
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
		
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(gen.next());
		}
	}
}
