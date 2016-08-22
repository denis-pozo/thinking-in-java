package org.denispozo.tutorial.thj.type.information.toys;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 1
 */

public class ToyTestEx1 {
	
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
			c = Class.forName("org.denispozo.tutorial.thj.type.information.toys.FancyToyEx1");
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
			/* Explanation: Exception is thrown here because there is no 
			 * default constructor for the superclass */
			print("Can't instantiate"); 
			System.exit(1);
		} catch (IllegalAccessException e) {
			print("Can't access");
			System.exit(1);
		}
		
		printInfo(obj.getClass());
		
	}
	
}


interface HasBatteriesEx1 {}
interface WaterproofEx1 {}
interface ShootsEx1 {}

class ToyEx1 {
	/*
	 * Comment out the following default constructor
	 * to see NoSuchMethodError from (*1*) 
	 */
//	ToyEx1() {}
	ToyEx1(int i) {}
}

class FancyToyEx1 extends ToyEx1 
			   implements HasBatteriesEx1, WaterproofEx1, ShootsEx1 {
	FancyToyEx1() { super(1); }

}