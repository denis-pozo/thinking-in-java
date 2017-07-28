package org.denispozo.tutorial.thj.generics.erasure.compensating;

/*
 * Chapter - Generics
 * Section - Creating Instances of Types
 * Example and Exercise 23
 */

public class FactoryConstraintEx23 {
	
	public static void main(String[] args) {
		new Foo2<Integer>(new IntegerFactory(), 1);
		new Foo2<Widget>(new Widget.Factory(), 2);
	}
}

interface FactoryI<T> {
	T create(Integer arg);
}

class Foo2<T> {
	@SuppressWarnings("unused")
	private T x;
	public <F extends FactoryI<T>> Foo2(F factory, Integer i) {
		x = factory.create(i);
	}
}

class IntegerFactory implements FactoryI<Integer> {
	public Integer create(Integer i){
		return new Integer(i);
	}
}

class Widget {
	int i;
	public static class Factory implements FactoryI<Widget> {
		public Widget create(Integer i) {
			Widget w = new Widget();
			w.i = i;
			return w;
		}
	}
	
	@Override
	public String toString() {
		return "Widget " + i;
	}
}


/* Example - Without arguments */
//public class FactoryConstraintEx23 {
//	
//	public static void main(String[] args) {
//		new Foo2<Integer>(new IntegerFactory());
//		new Foo2<Widget>(new Widget.Factory());
//	}
//}
//
//interface FactoryI<T> {
//	T create();
//}
//
//class Foo2<T> {
//	@SuppressWarnings("unused")
//	private T x;
//	public <F extends FactoryI<T>> Foo2(F factory) {
//		x = factory.create();
//	}
//}
//
//class IntegerFactory implements FactoryI<Integer> {
//	public Integer create(){
//		return new Integer(0);
//	}
//}
//
//class Widget {
//	public static class Factory implements FactoryI<Widget> {
//		public Widget create() {
//			return new Widget();
//		}
//	}
//}