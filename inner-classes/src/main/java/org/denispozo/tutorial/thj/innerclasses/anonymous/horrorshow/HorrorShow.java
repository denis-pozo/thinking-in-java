package org.denispozo.tutorial.thj.innerclasses.anonymous.horrorshow;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Anonymous inner classes
 * Exercise 14
 */

public class HorrorShow {
	
	static void u(Monster monster) { 
		monster.menace(); 
	}
	
	static void v(DangerousMonster monster) { 
		monster.menace(); 
		monster.destroy();
	}
	
	static void w(Lethal lethal) {
		lethal.kill();
	}
	
	public DangerousMonster monsterMaker() {
		return new DangerousMonster(){
			public void menace(){
				print("DangerousMonster.menace()");
			}
			public void destroy(){
				print("DangerousMonster.destroy()");
			}
		};
	}
	
	public Vampire vampireMaker(){
		return new Vampire(){
			public void menace() {
				print("Vampire.menace()");
			}
			public void destroy() {
				print("Vampire.destroy()");
			}
			public void kill() {
				print("Vampire.kill()");
			}
			public void drinkBlood() {
				print("Vampire.drinkBlood()");
			}
		};
	}
	
	@SuppressWarnings("static-access")
	public static void main(String [] args) {
		HorrorShow show = new HorrorShow();
		show.u(show.monsterMaker());
		show.v(show.monsterMaker());
		show.u(show.vampireMaker());
		show.v(show.vampireMaker());
		show.w(show.vampireMaker());
	}
}

interface Monster{
	void menace();
}

interface DangerousMonster extends Monster{
	void destroy();
}

interface Lethal extends DangerousMonster{
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() { print("DragonZilla.menace()"); }
	public void destroy() { print("DragonZilla.destroy()"); }
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() { print("VeryBadVampire.menace()"); }
	public void destroy() { print("VeryBadVampire.destroy()"); }
	public void kill() { print("VeryBadVampire.kill()"); }
	public void drinkBlood() { print("VeryBadVampire.drinkBlood()"); }
}