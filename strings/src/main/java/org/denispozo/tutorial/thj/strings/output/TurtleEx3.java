package org.denispozo.tutorial.thj.strings.output;

import java.io.PrintStream;
import java.util.Formatter;

/*
 * Chapter - Strings
 * Section - The Formatter Class
 * Exercise 3
 */

public class TurtleEx3 {
	private String name;
	private Formatter f;
	
	public TurtleEx3(String name, Formatter f){
		this.name = name;
		this.f = f;
	}

	public void move(int x, int y){
		f.format("%s The turtle is at (%d, %d)\n", name, x, y);
	}
	
	public static void main(String[] args) {
		PrintStream outAlias = System.err;
		TurtleEx3 tommy = new TurtleEx3("Tommy", new Formatter(System.err));
		TurtleEx3 terry = new TurtleEx3("Terry", new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		
		tommy.move(3, 4);
		terry.move(2, 5);
		
		tommy.move(3, 3);
		terry.move(3, 3);
		
	}
}