//package org.denispozo.tutorial.thj.type.information.pets.exercise;
//
//import java.util.ArrayList;
//
//import org.denispozo.tutorial.thj.type.information.pets.Pet;
//import org.denispozo.tutorial.thj.type.information.pets.PetCreator;
//
///*
// * Chapter - Type Information
// * Section - Checking before a cast
// * Example - Facade to produce a default pet creator
// */
//
//public class PetsEx11 {
//	
//	public static final PetCreator creator = 
//			new LiteralPetCreatorEx11();
//	
//	public static Pet randomPet() {
//		return creator.randomPet();
//	}
//	
//	public static Pet[] createArray(int size){
//		return creator.createArray(size);
//	}
//	
//	public static ArrayList<Pet> arrayList(int size){
//		return creator.arrayList(size);
//	}
//
//}