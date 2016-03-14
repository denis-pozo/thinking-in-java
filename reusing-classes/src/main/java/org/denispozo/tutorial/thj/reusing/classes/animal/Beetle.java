package org.denispozo.tutorial.thj.reusing.classes.animal;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Reusing Classes
 * Section - Initialization with inheritance
 * Exercise 24 
 */

@SuppressWarnings("unused")
class Insect {
	private int i = 9;
	protected int j;
	
	Insect() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}
	
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		print(s);
		return 47;
	}
}
@SuppressWarnings("unused")
class AcornWeevil extends Beetle {
	private int o = printInit("AcornWeevil.o initialized");
	
	AcornWeevil() {
		print("o = " + o);
		print("j = " + j);
	}
	
	private static int x3 = printInit("static AcornWeevil.x3 initialized");
}
@SuppressWarnings("unused")
public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	
	public Beetle() {
		print("k = " + k);
		print("j = " + j);
	}
	
	private static int x2 = printInit("static Beetle.x2 initialized");
	public static void main (String [] args) {
		print("Beetle constructor");
		Beetle b = new Beetle();
		print("AcornWeevil constructor");
		AcornWeevil aw = new AcornWeevil();
	}

}
