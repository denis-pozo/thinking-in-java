package org.denispozo.tutorial.thj.type.information.literals;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Random;

/*
 * Chapter - Type Information
 * Section - Class literals
 * Example
 */

public class ClassInitialization {
	public static Random rand = new Random(47);
		
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException {
		Class<Initiable> initiable = Initiable.class;
		print("After creating Initiable ref");
		// Does not trigger initialization:
		print(Initiable.staticFinal);
		// Does trigger initialization
		print(Initiable.staticFinal2);
		// Does trigger initialization:
		print(Initiable2.staticNonFinal);
		Class initiable3 = Class.forName("org.denispozo.tutorial.thj.type.information.literals.Initiable3");
		print("After creating Initiable3 ref");
		print(Initiable3.staticNonFinal);
	}
}


class Initiable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	
	static { 
		print("Initializating Initiable");
	}
}

class Initiable2 {
	static int staticNonFinal = 147;
	
	static{
		print("Initializing Initiable");
	}
}

class Initiable3 {
	static int staticNonFinal = 74;
	
	static {
		print("Initializing Initiable3");
	}
}