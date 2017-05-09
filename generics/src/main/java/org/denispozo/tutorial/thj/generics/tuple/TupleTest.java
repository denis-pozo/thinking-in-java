package org.denispozo.tutorial.thj.generics.tuple;

/*
 * Chapter - Generics
 * Section - A Tuple Library
 * Example and part of Ex3
 */

public class TupleTest {
	
	static TwoTuple<String, Integer> f(){
		return new TwoTuple<String, Integer>("hi", 47);
	}
	
	static ThreeTuple<Amphibian, String, Integer> g(){
		return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
	}
	
	static FourTuple<Vehicle, Amphibian, String, Integer> h(){
		return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(), "hi", 47);
	}
	
	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k(){
		return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
	}
	
	static SixTupleEx3<Vehicle, Amphibian, String, Integer, Double, Boolean> l(){
		return new SixTupleEx3<Vehicle, Amphibian, String, Integer, Double, Boolean>(new Vehicle(), new Amphibian(), "hi", 47, 11.1, true);
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