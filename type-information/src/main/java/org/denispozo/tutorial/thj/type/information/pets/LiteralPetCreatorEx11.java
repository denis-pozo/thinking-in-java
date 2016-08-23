package org.denispozo.tutorial.thj.type.information.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Exercise 11
 */

public class LiteralPetCreatorEx11 extends PetCreator{

	public static final List<Class<? extends Pet>> ALL_TYPES =
			Collections.unmodifiableList(Arrays.asList(
					Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class, 
					Pug.class, EgyptianMau.class, Manx.class, Cymric.class, 
					Rat.class, Mouse.class, Hamster.class, Gerbil.class));
	
	// Types for random creation:
	private static final List<Class<? extends Pet>> types =
			ALL_TYPES.subList(ALL_TYPES.indexOf(Mutt.class), ALL_TYPES.size());
	
	public List<Class<? extends Pet>> types() {
		return types;
	}
	
	public static void main(String[] args) {
		System.out.println(types);
	}

}