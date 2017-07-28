package org.denispozo.tutorial.thj.generics.bounds;

/*
 * Chapter - Generics
 * Section - Bounds
 * Exercise 25
 */

public class PlayGroundEx25 {
	
	static <PERSON extends Runable> void doRun(PERSON person){
		person.run();
	}
	
	static <PERSON extends Jumpable> void doFly(PERSON person){
		person.jump();
	}

	public static void main(String[] args) {
		Boy boy = new Boy();
		doRun(boy);
		doFly(boy);
	}
}

interface Runable {
	void run();
}

interface Jumpable {
	void jump();
}

class Boy implements Runable, Jumpable {

	@Override
	public void jump() {
		System.out.println("Jumping!!");
	}

	@Override
	public void run() {
		System.out.println("Running!!");
	}
}