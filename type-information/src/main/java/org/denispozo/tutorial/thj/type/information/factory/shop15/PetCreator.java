package org.denispozo.tutorial.thj.type.information.factory.shop15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Pet;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Exercise 15
 */

public abstract class PetCreator {
	
	// ABSTRACT METHOD returns a list of different types of pet to create 
	public abstract List<Class<? extends Pet>> types();
	
	// Creates an array of pets
	public Pet [] createArray(int size){
		Pet [] array = new Pet[size];
		
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


	public Pet randomPet(){
		return PetFactory.createRandom();
	}
	
	
	
	

}
