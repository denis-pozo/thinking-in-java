package org.denispozo.tutorial.thj.generic.erasure.compensating;

import java.util.HashMap;
import java.util.Map;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Generics
 * Section - Compensating for Erasure
 * Exercise 21
 */

/* Note: I dont understand the need of keeping the kind tag within the class, when there is another
 * way of creating objects via createNew
 */

public class ClassTypeCaptureEx21<T> {
	Class<T> kind;
	Map<String, Class<?>> mapKind = new HashMap<String, Class<?>>();
	
	public ClassTypeCaptureEx21(Class<T> kind) {
		this.kind = kind;
	}
	
	public void addType(String typename, Class<?> kind){
		mapKind.put(typename, kind);
	}
	
	public Object createNew(String typename) {

		try{
			if(mapKind.containsKey(typename)){
				return mapKind.get(typename).newInstance();
			}
			throw new RuntimeException("Type " + typename + " not found");
		} catch (InstantiationException ie) {
			throw new RuntimeException(ie);
		} catch ( IllegalAccessException iae) {
			throw new RuntimeException(iae);
		}
	}
	
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	
	public static void main(String[] args) {
		ClassTypeCaptureEx21<Vehicle> ctt1 = new ClassTypeCaptureEx21<Vehicle>(Vehicle.class);
		ctt1.addType("Vehicle", Vehicle.class);
		ctt1.addType("Car", Car.class);
		print(ctt1.f(new Vehicle()));
		print(ctt1.f(new Car()));
		
		print(ctt1.createNew("Car"));
	}
}

class Vehicle {}
class Car extends Vehicle{}
