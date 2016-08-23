package org.denispozo.tutorial.thj.type.information.pets;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;
import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import org.denispozo.tutorial.thj.util.TypeCounter;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Example
 */

public class PetCount4 {
		
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