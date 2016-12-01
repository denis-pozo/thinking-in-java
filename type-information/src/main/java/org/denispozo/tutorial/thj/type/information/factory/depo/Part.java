package org.denispozo.tutorial.thj.type.information.factory.depo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.denispozo.tutorial.thj.type.information.factory.Factory;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public class Part {
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
		
	}

	static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
	
	static {
		// Collections.addAll() gives an unchecked generic array creation... for varags parameter" warning.
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
 	}
	
	private static Random rand = new Random(47);

	public static Part createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}