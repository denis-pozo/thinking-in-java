package org.denispozo.tutorial.thj.type.information.shop;

import java.util.ArrayList;
import java.util.List;

import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;

/**
 * Class extending PetCreator and implementing the abstract class types()
 *  
 * Chapter - Type Information
 * Section - Checking before a cast
 * Example and Exercise 11
 */
public class ForNameCreator extends PetCreator{

	private static List<Class<? extends Pet>> types = 
			new ArrayList<Class<? extends Pet>>();
	
	// Basically this class has to return a List containing all available types
	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}
	
	// Names of the classes or pets you have available
	private static String [] typeNames = {
		"org.denispozo.tutorial.thj.type.information.shop.pet.Mutt",
		"org.denispozo.tutorial.thj.type.information.shop.pet.Pug",
		"org.denispozo.tutorial.thj.type.information.shop.pet.EgyptianMau",
		"org.denispozo.tutorial.thj.type.information.shop.pet.Manx",
		"org.denispozo.tutorial.thj.type.information.shop.pet.Cymric",
		"org.denispozo.tutorial.thj.type.information.shop.pet.Rat",
		"org.denispozo.tutorial.thj.type.information.shop.pet.Mouse",
		"org.denispozo.tutorial.thj.type.information.shop.pet.Hamster",
		"org.denispozo.tutorial.thj.type.information.shop.pet.Gerbil"
	};
	
	// Classes loader statically loaded - For fulfilling types only once
	static { loader(); }
	
	@SuppressWarnings("unchecked")
	private static void loader() {
		try{
			for(String name : typeNames){
				types.add((Class<? extends Pet>)Class.forName(name));
			}
		} catch (ClassNotFoundException cnfe) {
			throw new RuntimeException(cnfe);
		}
	}
	

}
