package org.denispozo.tutorial.thj.type.information.pets.exercise;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.HashMap;

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
 * Example
 */

public class PetCountEx11 {
	
	public static void countPets(PetCreator creator) {
		PetCounter counter = new PetCounter();

		for(Pet pet : creator.createArray(20)){
			// List each individual pet:
			printnr(pet.getClass().getSimpleName() + " ");
			if(pet instanceof Pet){
				counter.count("Pet");				
			}
			if(pet instanceof Dog) {
				counter.count("Dog");		
			}
			if(pet instanceof Mutt) {
				counter.count("Mutt");
			}
			if(pet instanceof Pug) {
				counter.count("Pug");
			}
			if(pet instanceof Cat) {
				counter.count("Cat");
			}
			if(pet instanceof EgyptianMau) {
				counter.count("EgyptianMau");
			}
			if(pet instanceof Manx) {
				counter.count("Manx");
			}
			if(pet instanceof Cymric) {
				counter.count("Cymric");
			}
			if(pet instanceof Rodent) {
				counter.count("Rodent");
			}
			if(pet instanceof Rat) {
				counter.count("Rat");
			}
			if(pet instanceof Mouse) {
				counter.count("Mouse");
			}
			if(pet instanceof Hamster) {
				counter.count("Hamster");
			}
			if(pet instanceof Gerbil) {
				counter.count("Gerbil");
			}
		}
		print();
		print(counter);
	}
	
	@SuppressWarnings("serial")
	static class PetCounter extends HashMap<String, Integer>{
		public void count(String type){
			Integer quantity = get(type);
			if(quantity == null) {
				put(type, 1);
			} else {
				put(type, quantity + 1);
			}
		}
	}

	public static void main(String[] args) {
		countPets(new ForNameCreatorEx11());
	}
	
}