package org.denispozo.tutorial.thj.innerclasses.overrideninnen;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Inner Classes
 * Section - Can inner classes be overriden?
 * Example
 */

public class BigEgg extends Egg {
	
	public class Yolk {
		public Yolk() {
			print("BigEgg.Yolk()");
		}
	}
	
	public static void main(String [] args){
		new BigEgg();
	}
}

class Egg {
	@SuppressWarnings("unused")
	private Yolk y;
	
	public Egg() {
		print("New Egg()");
		y = new Yolk();
	}
	
	protected class Yolk {
		public Yolk() {
			print("Egg.Yolk()");
		}
	}
}
