package org.denispozo.tutorial.thj.generics.methods;

/*
 * Chapter - Generics
 * Section - Generic Methods
 * Exercise 10
 */

public class GenerizerEx11<T> {
	
	private T field;
	
	public void setField(T t){
		field = t;
	}
	
	public T getField(){
		return field;
	}

}
