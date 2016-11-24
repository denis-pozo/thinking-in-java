//package org.denispozo.tutorial.thj.type.information.pets.exercise;
//
//import static org.denispozo.tutorial.thj.util.PrintUtil.print;
//import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.denispozo.tutorial.thj.type.information.pets.Pet;
//import org.denispozo.tutorial.thj.type.information.pets.Pets;
//import org.denispozo.tutorial.thj.util.MapData;
//
///*
// * Chapter - Type Information
// * Section - Checking before a cast
// * Example
// */
//
//public class PetCount3Ex11 {
//	
//	@SuppressWarnings("serial")
//	static class PetCounter extends LinkedHashMap
//							<Class<? extends Pet>, Integer> {
//		
//		public PetCounter() {
//			super(MapData.map(LiteralPetCreatorEx11.ALL_TYPES, 0));
//		}
//		
//		public void count(Pet pet){
//			
//			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()){
//				if(pair.getKey().isInstance(pet)){
//					put(pair.getKey(), pair.getValue() + 1);
//				
//				}
//			}
//		}
//		
//		public String toString() {
//			StringBuilder result = new StringBuilder("{");
//			
//			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()){
//				result.append(pair.getKey().getSimpleName());
//				result.append("=");
//				result.append(pair.getValue());
//				result.append(", ");
//			}
//			result.delete(result.length()-2, result.length());
//			result.append("}");
//			return result.toString();
//		}
//	}
//	
//	public static void main(String[] args) {
//		PetCounter petCount = new PetCounter();
//		
//		for(Pet pet : Pets.createArray(20)){
//			printnr(pet.getClass().getSimpleName() + " ");
//			petCount.count(pet);
//		}
//		print();
//		print(petCount);
//	}
//
//}