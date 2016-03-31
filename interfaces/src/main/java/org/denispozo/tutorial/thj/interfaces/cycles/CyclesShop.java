package org.denispozo.tutorial.thj.interfaces.cycles;

public class CyclesShop {
	
	public static Cycle sell(CycleFactory factory){ 
		return factory.getCycle();
	}
	
	public static void main (String [] args ) {
		Cycle unicycle = sell(new UnicycleFactory());
		unicycle.ride();
		Cycle bicycle = sell(new BicycleFactory());
		bicycle.ride();
		Cycle tricycle = sell(new TricycleFactory());
		tricycle.ride();
	}

}
