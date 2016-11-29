package org.denispozo.tutorial.thj.type.information.shop;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;
import org.denispozo.tutorial.thj.util.MapData;

/*
 * Chapter - Type Information
 * Section - Checking before a cast
 * Example
 */

// This class is actually the client of the pet creator
public class DynamicPetCount {
	
	public static void main(String[] args) {
		// Using dynamic isInstance (instead of instanceof)
		PetCounter petCount = new PetCounter();
		
		for(Pet pet : Pets.createArray(20)){
			printnr(pet.getClass().getSimpleName() + " ");
			petCount.count(pet);
		}
		
		print();
		print(petCount);
	}
	
	
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {

		private static final long serialVersionUID = 1L;

		public PetCounter() {
			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}
		
		public void count(Pet pet){
			//Class.isInstance() eliminates instanceofs:
			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()){
				if(pair.getKey().isInstance(pet)){
					put(pair.getKey(), pair.getValue() + 1);
				}
			}
		}
	
		public String toString() {
			StringBuilder result = new StringBuilder("{");
			
			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()){
				result.append(pair.getKey().getSimpleName());
				result.append("=");
				result.append(pair.getValue());
				result.append(", ");
			}
			
			result.delete(result.length()-2, result.length());
			result.append("}");
			return result.toString();
		}
	
	}
	
	
	
	

}
