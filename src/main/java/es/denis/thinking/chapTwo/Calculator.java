package es.denis.thinking.chapTwo;

import static es.denis.thinking.utils.Print.*;

//Chapter - Operators: Exercise 4

public class Calculator {
	
	public static double speed(double space, double time){
		return space / time;
	}
	
	public static void main(String [] args){
		double space = 1000.0;
		double time = 50.0;
		print("Speed calculator: Space " + space + ", Time " + time);
		print("Speed: " + Calculator.speed(space, time) + " m/s");
	}
}
