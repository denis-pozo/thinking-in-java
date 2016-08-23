package org.denispozo.tutorial.thj.type.information.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Example
 */

public abstract class PetCreator {
	private Random rand = new Random(47);
	
	// The List of different types of Pet to create:
	public abstract List<Class<? extends Pet>> types();
	
	public Pet randomPet(){
		// Create random pet
		int n = rand.nextInt(types().size());
		
		try {
			return types().get(n).newInstance();
		} catch (InstantiationException ie) {
			throw new RuntimeException(ie);
		} catch (IllegalAccessException iae) {
			throw new RuntimeException(iae);
		}
	}
	
	public Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for(int i = 0 ; i < size ; i++){
			result[i] = randomPet();
		}
		return result;
	}
	
	public ArrayList<Pet> arrayList(int size) {
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}
}