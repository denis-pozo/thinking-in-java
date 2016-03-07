package org.denispozo.tutorial.thj.objects;

public class Incrementable {
	static int i = 47;
	
	static void increment(){ 
		i++; 
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("Exercice 7: Write the class incrementable");
		Incrementable sf = new Incrementable();
		Incrementable.increment();
		System.out.println("i = " + sf.i);
	}

}
