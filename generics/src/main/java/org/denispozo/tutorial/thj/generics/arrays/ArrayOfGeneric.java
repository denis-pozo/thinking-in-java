package org.denispozo.tutorial.thj.generics.arrays;

/*
 * Chapter - Generics
 * Section - Arrays of Generics
 * Example
 */

public class ArrayOfGeneric {

	static final int SIZE = 100;
	static Generic<Integer> [] gia;

	public static void main(String[] args) {
		// Compiles; produces a ClassCastExeption
//		gia = (Generic<Integer>[]) new Object[SIZE];
		// Runtime type is the raw (erased) type:
		gia = (Generic<Integer>[]) new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		gia[0] = new Generic<Integer>();
//		gia[1] = new Object();
//		gia[2] = new Generic<Double>();
	}
}

