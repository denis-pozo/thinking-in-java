package org.denispozo.tutorial.thj.generics.tuple;

import org.denispozo.tutorial.thj.generics.tuple.TupleTest;

import java.util.ArrayList;

/*
 * Chapter - Generics
 * Section - Building Complex Models
 * Example
 */

public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>> {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		TupleList<Vehicle, Amphibian, String, Integer> tl = 
				new TupleList<Vehicle, Amphibian, String, Integer>();
		tl.add(TupleTest.h());
		tl.add(TupleTest.h());
		for(FourTuple<Vehicle, Amphibian, String, Integer> i : tl) {
			System.out.println(i);
		}
		
	}
}
