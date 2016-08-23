package org.denispozo.tutorial.thj.type.information.pets;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Example
 */

public class ForNameCreator extends PetCreator{
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
			PACKAGE + ".Hamster"		
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