package org.denispozo.tutorial.thj.generic.erasure.compensating;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * Chapter - Generics
 * Section - Creating Instances of Types
 * Exercise 22
 */

public class InstantiateGenericTypeEx22<T> {
	private Class<?> kind;
	
	public InstantiateGenericTypeEx22(Class<?> kind) {
		this.kind = kind;
	}
	
	public Object createNew(Object ...args) {
		
		try {
			switch(args.length) {
				case 0: return kind.newInstance();
				case 1: return kind.getConstructor(args[0].getClass()).newInstance(args[0]);
				case 2: return kind.getConstructor(args[0].getClass(), args[1].getClass()).newInstance(args[0], args[1]);
			}
			return null;
		} catch (IllegalArgumentException | 
				InvocationTargetException | 
				NoSuchMethodException |
				SecurityException |
				InstantiationException |
				IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		InstantiateGenericTypeEx22<BuildingEx22> igtb = new InstantiateGenericTypeEx22<BuildingEx22>(BuildingEx22.class);
		InstantiateGenericTypeEx22<HouseEx22> igth = new InstantiateGenericTypeEx22<HouseEx22>(HouseEx22.class);
		
		@SuppressWarnings("unused")
		BuildingEx22 b = (BuildingEx22) igtb.createNew();
		print("House constructors:");
		@SuppressWarnings("rawtypes")
		Constructor [] constructors = HouseEx22.class.getConstructors();
		for(@SuppressWarnings("rawtypes") Constructor c : constructors){
			print(c);
		}
		HouseEx22 h1 = (HouseEx22)igth.createNew("Hawaii");
		HouseEx22 h2 = (HouseEx22)igth.createNew(3000);
		HouseEx22 h3 = (HouseEx22)igth.createNew("Manila", 5000);
		print("Constructed House Objects: ");
		print(h1);
		print(h2);
		print(h3);
	}

}

class BuildingEx22 {}
class HouseEx22 extends BuildingEx22 {
	private String location;
	private Integer area;
	
	public HouseEx22() {
		location = null;
	}
	
	public HouseEx22(String location) {
		this.location = location;
	}
	
	public HouseEx22(Integer area) {
		this.area = area;
	}
	
	public HouseEx22(String location, Integer area) {
		this.location = location;
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "House" + ((location == null) ? "": " in " + location) +
				((area != null) ? ", area " + area + " sqft" : "");
	}
	
}