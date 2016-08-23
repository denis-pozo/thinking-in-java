package org.denispozo.tutorial.thj.type.information.pets.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.denispozo.tutorial.thj.type.information.pets.Cat;
import org.denispozo.tutorial.thj.type.information.pets.Cymric;
import org.denispozo.tutorial.thj.type.information.pets.Dog;
import org.denispozo.tutorial.thj.type.information.pets.EgyptianMau;
import org.denispozo.tutorial.thj.type.information.pets.Hamster;
import org.denispozo.tutorial.thj.type.information.pets.Manx;
import org.denispozo.tutorial.thj.type.information.pets.Mouse;
import org.denispozo.tutorial.thj.type.information.pets.Mutt;
import org.denispozo.tutorial.thj.type.information.pets.Pet;
import org.denispozo.tutorial.thj.type.information.pets.PetCreator;
import org.denispozo.tutorial.thj.type.information.pets.Pug;
import org.denispozo.tutorial.thj.type.information.pets.Rat;
import org.denispozo.tutorial.thj.type.information.pets.Rodent;

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