package org.denispozo.tutorial.thj.generics.tuple;

import static org.denispozo.tutorial.thj.generics.tuple.Tuple.*;

/*
 * Chapter - Generics
 * Section - Simplifying tuple use
 * Example
 */

public class TupleTest2 {
	
	static TwoTuple<String, Integer> f(){
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
	
	static SixTupleEx3<Vehicle, Amphibian, String, Integer, Double, Boolean> l(){
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1, true);
	}
	
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
//		ttsi.first = "there";
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
		System.out.println(l());
	}
}

class Amphibian2 {}
class Vehicle2 {}