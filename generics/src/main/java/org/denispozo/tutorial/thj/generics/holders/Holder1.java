package org.denispozo.tutorial.thj.generics.holders;

/*
 * Chapter - Generics
 * Section - Simple Generics
 * Example
 */
public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
      this.a = a;
    }

    Automobile get() { return a; }
}

class Automobile {}
