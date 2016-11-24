//package org.denispozo.tutorial.thj.type.information.pets.exercise;
//
//import static org.denispozo.tutorial.thj.util.PrintUtil.print;
//import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;
//
//import org.denispozo.tutorial.thj.type.information.pets.Pet;
//import org.denispozo.tutorial.thj.util.TypeCounter;
//
///*
// * Chapter - Type Information
// * Section - Checking before a cast
// * Example
// */
//
//public class PetCount4Ex11 {
//		
//	public static void main(String[] args) {
//		TypeCounter counter = new TypeCounter(Pet.class);
//				
//		for(Pet pet : PetsEx11.createArray(20)){
//			printnr(pet.getClass().getSimpleName() + " ");
//			counter.count(pet);
//		}
//		print();
//		print(counter);
//	}
//
//}