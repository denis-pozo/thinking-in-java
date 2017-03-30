package org.denispozo.tutorial.thj.generics.tuple;

/*
 * Chapter - Generics
 * Section - A Tuple Library
 * Example
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
      first = a;
      second = b;
    }

    public String toString(){
    	return "(" + first + ", " + second + ")";
    }
}
