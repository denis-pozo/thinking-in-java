package org.denispozo.tutorial.thj.generics.holders;

/*
 * Chapter - Generics
 * Section - Simple Generics
 * Exercise 2
 */
public class TripleHolderEx2<T> {
    private T one;
    private T two;
    private T three;
    
    public TripleHolderEx2(T one, T two, T three) {
      this.one = one;
      this.two = two;
      this.three = three;
    }
    
    public T getFirst(){
    	return one;
    }
    
    public T getSecond() {
    	return two;
    }
    
    public T getThird() {
    	return three;
    }

	public static void main(String[] args) {
		TripleHolderEx2<Thing> h3 = new TripleHolderEx2<Thing>(new Thing("Ball"), new Thing("Cup"), new Thing("Meta-Thing"));
		
		System.out.println(h3.getFirst());
		System.out.println(h3.getSecond());
		System.out.println(h3.getThird());
	}
}

class Thing{
	private String name;
	
	Thing(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "This thing is a " + name;
	}
}