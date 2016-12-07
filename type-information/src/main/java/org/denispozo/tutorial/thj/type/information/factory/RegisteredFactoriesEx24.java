package org.denispozo.tutorial.thj.type.information.factory;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.denispozo.tutorial.thj.util.Null;

/*
 * Chapter - Type Information
 * Section - Null Object
 * Exercise 24
 */

class PartEx24 {
	public String toString() {
		return getClass().getSimpleName();
	}
	
	static List<Factory<? extends PartEx24>> partFactories = 
		 					new ArrayList<Factory<? extends PartEx24>>();
	static {
		partFactories.add(new NullPartEx24.Factory());
		partFactories.add(new FuelFilterEx24.Factory());
		partFactories.add(new AirFilterEx24.Factory());
		partFactories.add(new CabinAirFilterEx24.Factory());
		partFactories.add(new OilFilterEx24.Factory());
		partFactories.add(new FanBeltEx24.Factory());
		partFactories.add(new PowerSteeringBeltEx24.Factory());
		partFactories.add(new GeneratorBeltEx24.Factory());
	}
	
	private static Random rand = new Random(47);
	public static PartEx24 createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}

class FilterEx24 extends PartEx24 {}

class NullPartEx24 extends PartEx24 implements Null {
	
	public static final PartEx24 NULL = new NullPartEx24();
	
	private NullPartEx24() {
		super();
	}
	
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.Factory<NullPartEx24> {
			public NullPartEx24 create() {
				return (NullPartEx24)NULL;
			}
	}
}

class FuelFilterEx24 extends FilterEx24 { 

	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.Factory<FuelFilterEx24> {
		public FuelFilterEx24 create() {
			return new FuelFilterEx24();
		}
	}
}

	


class AirFilterEx24 extends FilterEx24 { 
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.Factory<AirFilterEx24> {
		public AirFilterEx24 create() {
			return new AirFilterEx24();
		}
	}
}

class CabinAirFilterEx24 extends FilterEx24 {
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.Factory<CabinAirFilterEx24> {
		public CabinAirFilterEx24 create() {
			return new CabinAirFilterEx24();
		}
	}
}

class OilFilterEx24 extends FilterEx24 { 
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.Factory<OilFilterEx24> {
		public OilFilterEx24 create() {
			return new OilFilterEx24();
		}
	}
}

class BeltEx24 extends PartEx24 { }

class FanBeltEx24 extends BeltEx24 { 
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.Factory<FanBeltEx24> {
		public FanBeltEx24 create() {
			return new FanBeltEx24();
		}
	}
}

class GeneratorBeltEx24 extends BeltEx24 { 
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.Factory<GeneratorBeltEx24> {
		public GeneratorBeltEx24 create() {
			return new GeneratorBeltEx24();
		}
	}
}

class PowerSteeringBeltEx24 extends BeltEx24 { 
	public static class Factory 
		implements org.denispozo.tutorial.thj.type.information.factory.Factory<PowerSteeringBeltEx24> {
		public PowerSteeringBeltEx24 create() {
			return new PowerSteeringBeltEx24();
		}
	}
}

public class RegisteredFactoriesEx24 {

	public static void main(String [] args){
		for(int i = 0 ; i < 10 ; i++){
			print(PartEx24.createRandom());
		}
	}
}