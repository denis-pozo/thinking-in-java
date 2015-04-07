package es.denis.thinking.chapTwo;

import static es.denis.thinking.utils.Print.*;
import static org.junit.Assert.*;

import org.junit.Test;

//Chapter - Operators: Exercise 2

public class AliasingTest {
	
	@Test
	public void numberShouldBeEqualAfterChange(){
		Aliasing a = new Aliasing(1);
		Aliasing b = new Aliasing(2);
		
		print("Aliasing a.number: " + a.number);
		print("Aliasing b.number: " + b.number);
		assertNotEquals("a.number and b.number shouldn't be equal", a.number, b.number);
		a = b;
		a.number = 7;
		print("a = b ; a.number = 7");
		print("Aliasing a.number: " + a.number);
		print("Aliasing b.number: " + b.number);
		assertEquals("a.number and b.number should be equal to 7", (float) b.number, (float) 7, 0.0);
		
	}
}
