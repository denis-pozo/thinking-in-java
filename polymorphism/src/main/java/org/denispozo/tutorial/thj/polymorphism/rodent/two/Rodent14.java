package org.denispozo.tutorial.thj.polymorphism.rodent.two;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Inheritance and Cleanup
 * Exercise 14
 */

@SuppressWarnings("unused")
class Characteristic {
	private String s;
	Characteristic(String s) {
		this.s = s;
		print("Creating Characteristic " + s);
	}	
}

@SuppressWarnings("unused")
class Description {
	private String s;
	Description(String s) {
		this.s = s;
		print("Creating Description " + s);
	}
}

@SuppressWarnings("unused")
class Rodent {
	private String name = "Rodent";
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++; 
	private Characteristic c = new Characteristic("has tail");
	private Description d = new Description("small mammal");
	Rodent(Shared shared) { 
		print("Rodent() " + id); 
		this.shared = shared;
		this.shared.addRef();
	}
	protected void eat() { print("Rodent.eat()"); }
	protected void run() { print("Rodent.run()"); }
	protected void sleep() { print("Rodent.sleep()"); }
	public String toString() { return name + " " + id; }
}

@SuppressWarnings("unused")
class Mouse extends Rodent {
	private String name = "Mouse";
	private Characteristic c = new Characteristic("likes cheese");
	private Description d = new Description("nocturnal");
	Mouse(Shared shared) {
		super(shared); 
		print("Mouse()");		
	}
	protected void eat() { print("Mouse.eat()"); }
	protected void run() { print("Mouse.run()"); }
	protected void sleep() { print("Mouse.sleep()"); }
	public String toString() { return name + ", " + super.toString(); }
}

@SuppressWarnings("unused")
class Rat extends Rodent {
	private String name = "Rat";
	private Characteristic c = new Characteristic("larger");
	private Description d = new Description("black");
	Rat(Shared shared) { 
		super(shared);
		print("Rat()"); 
	}
	protected void eat() { print("Rat.eat()"); }
	protected void run() { print("Rat.run()"); }
	protected void sleep() { print("Rat.sleep()"); }
	public String toString() { return name + ", " + super.toString(); }
}

@SuppressWarnings("unused")
class Squirrel extends Rodent {
	private String name = "Squirrel";
	private Characteristic c = new Characteristic("climbs trees");
	private Description d = new Description("likes nuts");
	Squirrel(Shared shared) { 
		super(shared);
		print("Squirrel()"); 
	}
	protected void eat() { print("Squirrel.eat()"); }
	protected void run() { print("Squirrel.run()"); }
	protected void sleep() { print("Squirrel.sleep()"); }
	public String toString() { return name + ", " + super.toString(); }
}

public class Rodent14 {
	private static RandomRodentGenerator gen = new RandomRodentGenerator();
	public static void main(String[] args) {
		Rodent [] rodents = new Rodent [5];
		for(Rodent r : rodents) {
			r = gen.next();
			print(r);
		}
		gen.shared.showRefcount();		
	}
}