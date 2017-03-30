package org.denispozo.tutorial.thj.generics.holders;

import org.denispozo.tutorial.thj.type.information.shop.pet.Cat;
import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;
/*
 * Chapter - Generics
 * Section - Simple Generics
 * Exercise 1
 */
public class Holder3Ex1<T> {
    private T a;

    public Holder3Ex1(T a) {
      this.a = a;
    }
    
    public void set(T a) {
        this.a = a;
      }

    public T get() { return a; }

	public static void main(String[] args) {
		Holder3Ex1<Pet> h3 = new Holder3Ex1<Pet>(new Cat("Miau"));
		Pet a = h3.get();
		System.out.println(a);
		// h3.set(new Individual());
	}
}