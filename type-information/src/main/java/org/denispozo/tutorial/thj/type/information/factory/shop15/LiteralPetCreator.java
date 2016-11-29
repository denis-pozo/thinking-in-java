package org.denispozo.tutorial.thj.type.information.factory.shop15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Cat;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Cymric;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Dog;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.EgyptianMau;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Gerbil;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Hamster;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Manx;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Mouse;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Mutt;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Pet;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Pug;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Rat;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Rodent;



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
