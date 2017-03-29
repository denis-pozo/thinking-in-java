package org.denispozo.tutorial.thj.generics.holders;

/*
 * Chapter - Generics
 * Section - Simple Generics
 * Example
 */
public class Holder2 {
    private Object a;

    public Holder2(Object a) {
      this.a = a;
    }
    
    public void set(Object a) {
        this.a = a;
      }

    Object get() { return a; }
    
    @SuppressWarnings("unused")
	public static void main(String[] args) {
		Holder2	holder = new Holder2(new Automobile());
		Automobile a = (Automobile)holder.get();
		holder.set("Not an Automobile");
		String s = (String)holder.get();
		holder.set(1);
		Integer x = (Integer)holder.get();		
	}
}


