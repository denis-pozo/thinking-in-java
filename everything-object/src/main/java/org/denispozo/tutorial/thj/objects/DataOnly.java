package org.denispozo.tutorial.thj.objects;

public class DataOnly {
	
	int i;
	double d;
	boolean b;
	
	public DataOnly(){
		this.i = 47;
		this.d = 1.1;
		this.b = false;
	
		System.out.println("Exercice 4: Implement DataOnly code");
	}
	
	public static void main(String[] args) {
		DataOnly data = new DataOnly();
		System.out.println("i: " + data.i);
		System.out.println("d: " + data.d);
		System.out.println("b: " + data.b);
	}

}
