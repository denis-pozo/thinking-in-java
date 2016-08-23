package org.denispozo.tutorial.thj.type.information.pets.exercise;

import java.util.ArrayList;
import java.util.List;

import org.denispozo.tutorial.thj.type.information.pets.Pet;
import org.denispozo.tutorial.thj.type.information.pets.PetCreator;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 11
 */

public class ForNameCreatorEx11 extends PetCreator{
	private static List<Class<? extends Pet>> types = 
				new ArrayList<Class<? extends Pet>>();
	
	private static final String PACKAGE =
			"org.denispozo.tutorial.thj.type.information.pets";
	
	// Types that you want to be randomly created:
	private static final String[] TYPE_NAMES = {
			PACKAGE + ".Mutt",
			PACKAGE + ".Pug",
			PACKAGE + ".EgyptianMau",
			PACKAGE + ".Manx",
			PACKAGE + ".Cymric",
			PACKAGE + ".Rat",
			PACKAGE + ".Mouse",
			PACKAGE + ".Hamster",
			PACKAGE + ".Gerbil"
	};
	
	@SuppressWarnings("unchecked")
	private static void loader() {
		try {
			for(String name : TYPE_NAMES){
				types.add((Class<? extends Pet>) Class.forName(name));
			}
		} catch (ClassNotFoundException cnfe) {
			throw new RuntimeException(cnfe);
		}
	}
	
	static { loader(); }

	public List<Class<? extends Pet>> types() {
		return types;
	}
}