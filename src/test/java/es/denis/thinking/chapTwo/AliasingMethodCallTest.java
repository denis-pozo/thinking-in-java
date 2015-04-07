package es.denis.thinking.chapTwo;

import static es.denis.thinking.utils.Print.print;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AliasingMethodCallTest {
	
	@Test
	public void numberShouldBeEqualAfterChange(){
		AliasingDuringMethodCalls a = new AliasingDuringMethodCalls(1);
			
		print("Aliasing a.number: " + a.number);
		assertNotEquals("a.number and b.number shouldn't be equal", a.number, (float) 987);
		AliasingDuringMethodCalls.setNumber(a);
		print("AliasingDuringMethodCalls.setNumber(a);");
		print("Aliasing a.number: " + a.number);
		assertNotEquals("a.number shouldnt be equal to 1", (float) a.number, (float) 1);

	}
}
