package org.denispozo.tutorial.thj.interfaces.horrorshow;

/*
 * Chapter - Interfaces
 * Section - Extending an interface with inheritance
 * Exercise 14 and 15
 */

public class HorrorShow {

	public static void invokeMonster(Monster monster) {	}
	public static void invokeAnimal(Animal animal) {	}
	public static void invokePerson(Person person) {	}
	public static void invokeHybrid(Hybrid hybrid) {	}
	
	public static void main(String [] args) {
		CrazyCriature criature = new CrazyCriature();
		invokeMonster(criature);
		invokePerson(criature);
		invokeAnimal(criature);
		invokeHybrid(criature);
		CrazyCriature2 criature2 = new CrazyCriature2();
		invokeMonster(criature2);
		invokePerson(criature2);
		invokeAnimal(criature2);
		invokeHybrid(criature2);
	}
}
