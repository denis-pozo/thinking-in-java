package org.denispozo.tutorial.thj.initcleanup;

import static org.denispozo.tutorial.thj.util.Print.*;

public class Cups {

	static Cup cup1;
	static Cup cup2;
		
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	Cups(){
		print("Cups()");
	}

}
