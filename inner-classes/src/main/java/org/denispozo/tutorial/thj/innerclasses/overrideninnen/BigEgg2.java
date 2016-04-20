package org.denispozo.tutorial.thj.innerclasses.overrideninnen;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Can inner classes be overriden?
 * Example
 */

public class BigEgg2 extends Egg2 {
	
	public BigEgg2() {
		insertYolk(new Yolk());
	}
	
	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			print("BigEgg2.Yolk()");
		}
		
		public void f() { 
			print("BigEgg2.Yolk.f()");
		}
	}
	
	public static void main(String [] args){
		Egg2 egg = new BigEgg2();
		egg.g();
		
	}
}

class Egg2 {
	
	private Yolk y = new Yolk();
	
	public Egg2() {
		print("New Egg2()");
	}
	
	public void insertYolk(Yolk yy){
		y = yy;
	}
	
	public void g() {
		y.f();
	}
	
	protected class Yolk {
		public Yolk() {
			print("Egg2.Yolk()");
		}
		
		public void f(){
			print("Egg2.Yolk.f()");
		}
	}
}
