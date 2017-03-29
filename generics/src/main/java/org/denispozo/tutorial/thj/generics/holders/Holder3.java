package org.denispozo.tutorial.thj.generics.holders;

/*
 * Chapter - Generics
 * Section - Simple Generics
 * Example
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
      this.a = a;
    }
    
    public void set(T a) {
        this.a = a;
      }

    public T get() { return a; }

    @SuppressWarnings("unused")
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get();
//		h3.set("Not an Automobile");
//		h3.set(3);
	}
}