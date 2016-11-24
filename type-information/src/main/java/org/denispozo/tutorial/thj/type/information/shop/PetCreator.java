package org.denispozo.tutorial.thj.type.information.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;

public abstract class PetCreator {
	
	private Random rand = new Random(47);
	
	// ABSTRACT METHOD returns a list of different types of pet to create 
	public abstract List<Class<? extends Pet>> types();
	
	// Creates an array of pets
	public Pet[] createArray(int size){
		Pet[] array = new Pet[size];
		
		for(int i = 0 ; i < size ; i++){
			array[i] = randomPet();
		}
		return array;
			
	}
	
	// Creates a list of pets
	public List<Pet> createList(int size){
		List<Pet> list = new ArrayList<Pet>();
		
		Collections.addAll(list, createArray(size));
		return list;
	}


	// Creates ONE random Pet by using Class.newInstance() 
	public Pet randomPet(){
		int n = rand.nextInt(types().size());
		
		try{
			return types().get(n).newInstance();
		} catch (InstantiationException ie) {
			throw new RuntimeException(ie);
		} catch (IllegalAccessException iae) {
			throw new RuntimeException(iae);
		}
	}
	
	
	
	

}
