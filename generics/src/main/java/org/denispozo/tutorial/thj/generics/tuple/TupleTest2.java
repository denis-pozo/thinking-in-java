package org.denispozo.tutorial.thj.generics.tuple;

import static org.denispozo.tutorial.thj.generics.tuple.Tuple.*;

/*
 * Chapter - Generics
 * Section - Simplifying tuple use
 * Example and Exercise 15
 */

public class TupleTest2 {
	
	static TwoTuple<String, Integer> f(){
		return tuple("hi", 47);
	}
	
	@SuppressWarnings("rawtypes")
	static TwoTuple f2(){
		return tuple("hi", 47);
	}
	
	static ThreeTuple<Amphibian, String, Integer> g(){
		return tuple(new Amphibian(), "hi", 47);
	}
	
	static FourTuple<Vehicle, Amphibian, String, Integer> h(){
		return tuple(new Vehicle(), new Amphibian(), "hi", 47);
	}
	
	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k(){
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
	}
	
	static SixTupleEx16<Vehicle, Amphibian, String, Integer, Double, Boolean> l(){
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1, true);
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		ttsi = f2();
		System.out.println(ttsi);
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
		System.out.println(l());
	}
}