package org.denispozo.tutorial.thj.generics.tuple;

/*
 * Chapter - Generics
 * Section - A Tuple Library
 * Exercise 3
 */

public class SixTupleEx16<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
	public final F sixth;

    public SixTupleEx16(A a, B b, C c, D d, E e, F f) {
      super(a,b,c,d,e);
      sixth = f;
    }

    public String toString(){
    	return "(" + first + ", " + second + ", " + third + 
    				", " + fourth + ", " + fifth + ", " + sixth + ")";
    }
}
