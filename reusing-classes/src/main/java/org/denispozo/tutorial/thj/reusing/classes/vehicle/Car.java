package org.denispozo.tutorial.thj.reusing.classes.vehicle;

/*
 * Chapter - Reusing Classes
 * Section - Choosing composition vs. inheritance
 * Exercise 14
 */

public class Car {

	public Engine engine = new Engine();
	public Wheel [] wheel = new Wheel[4];
	public Door left = new Door();
	public Door right = new Door();
	
	public Car() {
		
		for(int i = 0 ; i < 4 ; i++) {
			wheel[i] = new Wheel();
		}
	}
	
	public static void main(String [] args) {
		Car car = new Car();
		car.left.window.rolldown();
		car.wheel[0].inflate(72);
		car.engine.service();
	}
}
