package org.denispozo.tutorial.thj.exception.finallying;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Using finally during return
 * Exercise 17
 */

public class FrogEx17 extends Amphibian {

	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");

	public FrogEx17() { print("FrogEx17()"); }

	public static void jump() {
		print("frog jumps");
	}

	protected void dispose() {
		print("Frog17 dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		FrogEx17 frog = new FrogEx17();
		try {
			frog.jump();
			print("Returning from try-finally");
			return;
		} finally {
			print("Bye!");
			frog.dispose();
		}
	}
}

class Characteristic {
	private String s;

	Characteristic(String s) {
		this.s = s;
		print("Creating Characteristic " + s);
	}

	protected void dispose() {
		print("disposing Characteristic " + s);
	}
}

class Description {
	private String s;

	Description(String s) {
		this.s = s;
		print("Creating Description " + s);
	}

	protected void dispose() {
		print("disposing Description " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");

	LivingCreature() {
		print("LivingCreature()");
	}

	protected void dispose() {
		print("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");

	Animal() {
		print("Animal()");
	}

	protected void dispose() {
		print("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");

	Amphibian() {
		print("Amphibian()");
	}

	protected void dispose() {
		print("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
