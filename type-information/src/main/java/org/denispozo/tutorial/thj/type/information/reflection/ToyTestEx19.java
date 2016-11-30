package org.denispozo.tutorial.thj.type.information.reflection;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.lang.reflect.InvocationTargetException;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Example
 */

public class ToyTestEx19 {
	
	@SuppressWarnings("rawtypes")
	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() + " is interface? [" +
			   cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name: " + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
				
		try{
			Toy.class.getDeclaredConstructor(int.class).newInstance(1);

		} catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
				e.printStackTrace();
		} catch(NoSuchMethodException nsme) {
			print("No such method: " + nsme);
		} catch(InstantiationException ie) {
			print("Unable to make a Toy: " + ie);
		} catch(InvocationTargetException ite) {
			print("Target invocation exception: " + ite);
		}
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
	Toy() {
		print("Creating a new Toy()"); 
	}
	
	Toy(int i) {
		print("Creating a new Toy(int " + i + ")");
	}
}

class FancyToy extends Toy 
			   implements HasBatteries, Waterproof, Shoots {
	FancyToy() { super(1); }

}