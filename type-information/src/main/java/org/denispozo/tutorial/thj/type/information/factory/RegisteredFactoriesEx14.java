package org.denispozo.tutorial.thj.type.information.factory;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

class PartEx14 {
	public String toString() {
		return getClass().getSimpleName();
	}
	
	static List<Class<? extends PartEx14>> partFactories = 
		 					new ArrayList<Class<? extends PartEx14>>();
	static {
		partFactories.add(FuelFilterEx14.class);
		partFactories.add(AirFilterEx14.class);
		partFactories.add(CabinAirFilterEx14.class);
		partFactories.add(OilFilterEx14.class);
		partFactories.add(FanBeltEx14.class);
		partFactories.add(PowerSteeringBeltEx14.class);
		partFactories.add(GeneratorBeltEx14.class);
	}
	
	private static Random rand = new Random(47);
	public static PartEx14 createRandom() {
		int n = rand.nextInt(partFactories.size());
		try{ 
			return partFactories.get(n).newInstance();	
		} catch(InstantiationException e) {
			throw new RuntimeException(e);
		} catch(IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
}

class FilterEx14 extends PartEx14 {}

class FuelFilterEx14 extends FilterEx14 { }

class AirFilterEx14 extends FilterEx14 { }

class CabinAirFilterEx14 extends FilterEx14 { }

class OilFilterEx14 extends FilterEx14 { }

class BeltEx14 extends PartEx14 { }

class FanBeltEx14 extends BeltEx14 { }

class GeneratorBeltEx14 extends BeltEx14 { }

class PowerSteeringBeltEx14 extends BeltEx14 { }

public class RegisteredFactoriesEx14 {

	public static void main(String [] args){
		for(int i = 0 ; i < 10 ; i++){
			print(PartEx14.createRandom());
		}
	}
}