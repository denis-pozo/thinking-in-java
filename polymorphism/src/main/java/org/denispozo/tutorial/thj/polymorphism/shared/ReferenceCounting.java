package org.denispozo.tutorial.thj.polymorphism.shared;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Constructors and Polymorphism
 * Exercise 11
 */

public class ReferenceCounting {
	
	protected void finalize() {
	}
	
	public static void main(String [] args) {
		Shared shared = new Shared();
		Composing [] composing = { new Composing(shared),
				new Composing(shared), new Composing(shared), 
				new Composing(shared), new Composing(shared) }; 
		
		boolean first = true;
		for(Composing elem : composing){
			if(first) first = false;
			else elem.dispose();
			
		}
		System.gc();
	}
}

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	
	public Shared() {
		print("Creating " + this);
	}
	
	public void addRef() {
		refcount++;
	}
	
	protected void dispose() {
		if(--refcount == 0){
			print("Disposing " + this);
		}
	}
	
	public String toString() {
		return "Shared " + id;
 	}
	
	@Override
	protected void finalize() {
		if(refcount != 0){
			print("Error: Shared elements remaining");
		}
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	
	public Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	protected void dispose() {
		print("disposing " + this);
		shared.dispose();
	}
	
	public String toString() {
		return "Composing " + id;
 	}
}

