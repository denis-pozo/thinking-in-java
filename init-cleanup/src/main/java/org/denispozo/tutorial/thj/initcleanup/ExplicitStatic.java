package org.denispozo.tutorial.thj.initcleanup;

import static org.denispozo.tutorial.thj.util.Print.*;

public class ExplicitStatic {
	public static void main (String ... args){
		print("Inside main ()");
		Cups.cup1.function(99);
	}
	
	static Cups cups1 = new Cups();
	static Cups cups2 = new Cups();
}
