package org.denispozo.tutorial.thj.type.information.pets;

import java.util.ArrayList;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Example - Facade to produce a default pet creator
 */

public class Pets {
	
	public static final PetCreator creator = 
			new LiteralPetCreator();
	
	public static Pet randomPet() {
		return creator.randomPet();
	}
	
	public static Pet[] createArray(int size){
		return creator.createArray(size);
	}
	
	public static ArrayList<Pet> arrayList(int size){
		return creator.arrayList(size);
	}

}