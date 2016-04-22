package org.denispozo.tutorial.thj.innerclasses.factories.cycles;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Inner Classes
 * Section - Factory Method Revisited
 * Exercise 16
 */

public class CyclesShop {
	
	public static Cycle sell(CycleFactory factory){ 
		return factory.getCycle();
	}
	
	public static void main (String [] args ) {
		Cycle cycle = sell(Unicycle.factory);
		print("Cycle with " + cycle.wheels() + " wheels:");
		cycle.ride();
		cycle = sell(Bicycle.factory);
		print("Cycle with " + cycle.wheels() + " wheels:");
		cycle.ride();
		cycle = sell(Tricycle.factory);
		print("Cycle with " + cycle.wheels() + " wheels:");
		cycle.ride();
	}

}

interface Cycle { 
	public int wheels(); 
	public void ride();
}

interface CycleFactory {
	public Cycle getCycle(); 
}

class Unicycle implements Cycle {
	
	private static final int NUM_WHEELS = 1;
	
	private Unicycle() { }
	
	@Override
	public int wheels() {
		return NUM_WHEELS;
	}	
	
	@Override
	public void ride() {
		print("Unicycle.ride()");
	}
	
	public static CycleFactory factory = new CycleFactory() { 
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}

class Bicycle implements Cycle {
	
	private static final int NUM_WHEELS = 2;
	
	private Bicycle() { }
	
	@Override
	public int wheels() {
		return NUM_WHEELS;
	}	
	
	@Override
	public void ride() {
		print("Bicycle.ride()");
	}
	
	public static CycleFactory factory = new CycleFactory() { 
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
}

class Tricycle implements Cycle {
	
	private static final int NUM_WHEELS = 3;
	
	private Tricycle() { }
	
	@Override
	public int wheels() {
		return NUM_WHEELS;
	}	
	
	@Override
	public void ride() {
		print("Tricycle.ride()");
	}
	
	public static CycleFactory factory = new CycleFactory() { 
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
}


