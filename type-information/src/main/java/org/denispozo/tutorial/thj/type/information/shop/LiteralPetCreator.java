package org.denispozo.tutorial.thj.type.information.shop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.denispozo.tutorial.thj.type.information.shop.pet.Cat;
import org.denispozo.tutorial.thj.type.information.shop.pet.Cymric;
import org.denispozo.tutorial.thj.type.information.shop.pet.Dog;
import org.denispozo.tutorial.thj.type.information.shop.pet.EgyptianMau;
import org.denispozo.tutorial.thj.type.information.shop.pet.Gerbil;
import org.denispozo.tutorial.thj.type.information.shop.pet.Hamster;
import org.denispozo.tutorial.thj.type.information.shop.pet.Manx;
import org.denispozo.tutorial.thj.type.information.shop.pet.Mouse;
import org.denispozo.tutorial.thj.type.information.shop.pet.Mutt;
import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;
import org.denispozo.tutorial.thj.type.information.shop.pet.Pug;
import org.denispozo.tutorial.thj.type.information.shop.pet.Rat;
import org.denispozo.tutorial.thj.type.information.shop.pet.Rodent;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Example and Exercise 11
 */

// Another creator but with class literals instead of forName(String)
public class LiteralPetCreator extends PetCreator {
	// No try block needed
	
	public static final List<Class<? extends Pet>> allTypes =
			Collections.unmodifiableList(
					Arrays.asList(Pet.class,
								  Dog.class,
								  Cat.class,
								  Rodent.class,
								  Mutt.class,
								  Pug.class,
								  EgyptianMau.class,
								  Manx.class,
								  Cymric.class,
								  Rat.class,
								  Mouse.class,
								  Hamster.class,
								  Gerbil.class));
	
	// Types for random creation:
	private static final List<Class<? extends Pet>> types = 
			allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	
	public List<Class<? extends Pet>> types() {
		return types;
	}
	
	public static void main(String[] args) {
		System.out.println(types);
	}
	

}
