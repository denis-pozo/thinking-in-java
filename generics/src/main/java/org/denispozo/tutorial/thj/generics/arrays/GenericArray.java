package org.denispozo.tutorial.thj.generics.arrays;

/*
 * Chapter - Generics
 * Section - Arrays of Generics
 * Example
 */

public class GenericArray<T> {
	private T[] array;
	
	@SuppressWarnings("unchecked")
	public GenericArray(int sz) {
		array = (T[])new Object[sz];
	}
	
	public void put(int index, T item) {
		array[index] = item;
	}
	
	public T get(int index) {
		return array[index];
	}
	
	public T[] rep() {
		return array;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GenericArray<Integer> gai = new GenericArray<Integer>(10);
//		Integer [] ia = gai.rep(); -> It causes a CastClassExceptionArrayOfGeneric.java
		Object [] oa = gai.rep();
	}

}

