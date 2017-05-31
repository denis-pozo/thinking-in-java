package org.denispozo.tutorial.thj.generic.erasure.compensating;

import java.util.HashMap;
import java.util.Map;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Generics
 * Section - Creating instances of types
 * Exercise 24
 */

/* Note: I dont understand the need of keeping the kind tag within the class, when there is another
 * way of creating objects via createNew
 */

interface Factory<T> {
	T create();
}

class BuildingEx24 {}

class HouseEx24 extends BuildingEx24 {}

class BuildingFactory implements Factory<BuildingEx24> {
	public BuildingEx24 create() {
		return new BuildingEx24();
	}
}

class HouseFactory implements Factory<HouseEx24> {
	public HouseEx24 create() {
		return new HouseEx24();
	}
}

@SuppressWarnings("rawtypes")
public class ClassTypeCaptureEx24<T> {
	Class<?> kind;
	public ClassTypeCaptureEx24(Class<?> kind) {
		this.kind = kind;
	}
	
	Map<String,Factory> map;	
	public ClassTypeCaptureEx24(Class<?> kind, Map<String,Factory> map) {
		this.kind = kind;
		this.map = map;
	}
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	public void addType(String typename, Factory factory) {
		map.put(typename, factory);
	}
	public Object createNew(String typename) 
		throws IllegalAccessException, InstantiationException {
		if(map.containsKey(typename))
			return map.get(typename).create();			
		System.out.println(typename + " class not available");
		return null;
	}
	public static void main(String[] args) {
		ClassTypeCaptureEx24<BuildingEx24> ctt1 = 
			new ClassTypeCaptureEx24<BuildingEx24>(BuildingEx24.class);
		print(ctt1.f(new BuildingEx24()));
		print(ctt1.f(new HouseEx24()));
		ClassTypeCaptureEx24<HouseEx24> ctt2 = 
			new ClassTypeCaptureEx24<HouseEx24>(HouseEx24.class);
		print(ctt2.f(new BuildingEx24()));
		print(ctt2.f(new HouseEx24()));
		ClassTypeCaptureEx24<BuildingEx24> ct = 
		new ClassTypeCaptureEx24<BuildingEx24>(
			BuildingEx24.class, new HashMap<String,Factory>());
		ct.addType("House", new HouseFactory());
		ct.addType("Building", new BuildingFactory());
		print("ct.map = " + ct.map);
		try {
			BuildingEx24 b = (BuildingEx24)ct.createNew("Building");
			HouseEx24 h = (HouseEx24)ct.createNew("House");
			print("b.getClass().getName(): ");
			print(b.getClass().getName());
			print("h.getClass().getName(): ");
			print(h.getClass().getName());
			print("House h is instance House: ");
			print(h instanceof HouseEx24);
			print("House h is instance of Building: ");
			print(h instanceof BuildingEx24);
			print("Building b is instance of House: ");
			print(b instanceof HouseEx24);
			ct.createNew("String");  // String class not available
		} catch(IllegalAccessException e) {
			print("IllegalAccessException in main");
		} catch(InstantiationException e) {
			print("InstantiationException in main");
		}		
	}
}