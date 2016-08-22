package org.denispozo.tutorial.thj.type.information.toys;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 2
 */

public class ToyTestEx2 {
	
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
			c = Class.forName("org.denispozo.tutorial.thj.type.information.toys.FancyToyEx2");
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


interface HasBatteriesEx2 {}
interface WaterproofEx2 {}
interface ShootsEx2 {}
interface DancesEx2 {}

class ToyEx2 {
	/*
	 * Comment out the following default constructor
	 * to see NoSuchMethodError from (*1*) 
	 */
	ToyEx2() {}
	ToyEx2(int i) {}
}

class FancyToyEx2 extends ToyEx2 
			   implements HasBatteriesEx2, WaterproofEx2, ShootsEx2, DancesEx2{
	FancyToyEx2() { super(1); }

}