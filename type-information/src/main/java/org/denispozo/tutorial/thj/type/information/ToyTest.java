package org.denispozo.tutorial.thj.type.information;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Example
 */

public class ToyTest {
	
	@SuppressWarnings("rawtypes")
	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() + " is interface? [" +
			   cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name: " + cc.getCanonicalName());
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Class c = null;
		
		try{
			c = Class.forName("typeinfo.toys.FancyToy");
		} catch (ClassNotFoundException e) {
			print("Can't find FancyToy");
			System.exit(1);
		}
		
		printInfo(c);
		for(Class face : c.getInterfaces()){
			printInfo(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try{
			obj = up.newInstance();
		} catch (InstantiationException e) {
			print("Can't instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			print("Can't access");
			System.exit(1);
		}
		
		printInfo(obj.getClass());
		
	}
	
}


interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
	/*
	 * Comment out the following default constructor
	 * to see NoSuchMethodError from (*1*) 
	 */
	Toy() {}
	Toy(int i) {}
}

class FancyToy extends Toy 
			   implements HasBatteries, Waterproof, Shoots {
	FancyToy() { super(1); }

}