package org.denispozo.tutorial.thj.type.information.shop;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;
import org.denispozo.tutorial.thj.util.TypeCounter;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Example
 */

public class PetCountWithTypeCounter {
	
	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Pet.class);
		
		for(Pet pet : Pets.createArray(20)){
			printnr(pet.getClass().getSimpleName() + " ");
			counter.count(pet);
		}
		print();
		print(counter);
	}
	
	
}
