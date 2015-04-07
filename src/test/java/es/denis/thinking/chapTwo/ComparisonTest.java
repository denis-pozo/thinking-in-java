package es.denis.thinking.chapTwo;

import static es.denis.thinking.utils.Print.*;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

//Chapter - Operators: Exercices 5 and 6

public class ComparisonTest {

	static Dog spot;
	static Dog scruffy;
	static Dog ruffy;
	
	@BeforeClass
	public static void initialise(){
		spot = new Dog("Spot", "Ruff!");
		scruffy = new Dog("Scruffy", "Wurf!");
		
		print(spot.name + " says " + spot.says);
		print(scruffy.name + " says " + scruffy.says);
		
		// Exercise 6
		ruffy = spot;
		print(ruffy.name + " says " + ruffy.says);
	}
	
	@Test
	public void spotAndScruffyShouldBeDifferent1(){
		assertFalse("Spot and scruffy shouldnt be equal with == ", spot == scruffy);
	}
	
	@Test
	public void spotAndScruffyShouldBeDifferent2(){
		assertFalse("Spot and scruffy shouldnt be equal with equal() ", spot.equals(scruffy));
	}
	
	@Test
	public void spotAndRuffyShouldBeEquals1(){
		assertTrue("Spot and ruffy should be equal with == ", spot == ruffy);
	}
	
	@Test
	public void spotAndRuffyShouldBeEquals2(){
		assertTrue("Spot and ruffy should be equal with equal() ", spot.equals(ruffy));
	}
}


