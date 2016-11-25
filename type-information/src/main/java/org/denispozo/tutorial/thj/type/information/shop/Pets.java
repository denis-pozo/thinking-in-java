package org.denispozo.tutorial.thj.type.information.shop;

import java.util.List;

import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;

// Façade to set a default PetCreator, in this case the one using literals
public class Pets {
	
	public static final PetCreator creator = new LiteralPetCreator();
	
	public static Pet randomPet() {
		return creator.randomPet();
	}
	
	public static Pet [] createArray(int size) {
		return creator.createArray(size);
	}
	
	public static List<Pet> createList(int size){
		return creator.createList(size);
	}

}
