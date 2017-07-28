package org.denispozo.tutorial.thj.generics.erasure;

/*
 * Chapter - Generics
 * Section - The Problem with Erasure
 * Example
 */

class GenericBase<T> {
	
	private T element;
	public void set(T arg){
		element = arg;
	}
	
	public T get() {
		return element;
	}
}

class Derived1<T> extends GenericBase<T> { }

@SuppressWarnings("rawtypes")
class Derived2 extends GenericBase { }

// This one throws a compilation error
// class Derived3 extends GenericBase<?> { }

public class ErasureAndInheritance {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Derived2 d2 = new Derived2();
		Object obj = d2.get();
		d2.set(obj);
	}
}