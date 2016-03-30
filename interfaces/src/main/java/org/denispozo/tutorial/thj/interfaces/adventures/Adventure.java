package org.denispozo.tutorial.thj.interfaces.adventures;

/*
 * Chapter - Interfaces
 * Section - Multiple inheritance in Java
 * Exercise 12
 */

public class Adventure {

	public static void t(CanFight x) { x.fight(); }
	public static void u(CanFly x) { x.fly(); }
	public static void v(CanSwim x) { x.swim(); }
	public static void w(CanClimb x) { x.climb(); }
	public static void x(ActionCharacter x) { x.fight(); }
	
	public static void main(String [] args) {
		Hero hero = new Hero();
		t(hero);
		u(hero);
		v(hero);
		w(hero);
		x(hero);
	}

}
