package org.denispozo.tutorial.thj.one;

public class DataOnlyMod {
	
	int i;
	double d;
	boolean b;
	
	public static void main(String [] args){
		DataOnlyMod data = new DataOnlyMod();
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		
		System.out.println("Exercice 5: The same as the 4th but values are given here, in function main");
		System.out.println("i: " + data.i);
		System.out.println("d: " + data.d);
		System.out.println("b: " + data.b);
	}
}
