package org.denispozo.tutorial.thj.type.information.shop;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.HashMap;

import org.denispozo.tutorial.thj.type.information.shop.pet.Cat;
import org.denispozo.tutorial.thj.type.information.shop.pet.Cymric;
import org.denispozo.tutorial.thj.type.information.shop.pet.Dog;
import org.denispozo.tutorial.thj.type.information.shop.pet.EgyptianMau;
import org.denispozo.tutorial.thj.type.information.shop.pet.Hamster;
import org.denispozo.tutorial.thj.type.information.shop.pet.Manx;
import org.denispozo.tutorial.thj.type.information.shop.pet.Mouse;
import org.denispozo.tutorial.thj.type.information.shop.pet.Mutt;
import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;
import org.denispozo.tutorial.thj.type.information.shop.pet.Pug;
import org.denispozo.tutorial.thj.type.information.shop.pet.Rat;
import org.denispozo.tutorial.thj.type.information.shop.pet.Rodent;

// This class is actually the client of the pet creator
public class PetCount {
	
	public static void countPets(PetCreator creator){
		PetCounter counter = new PetCounter();
		
		for(Pet pet : creator.createArray(20)) {
			printnr(pet.getClass().getSimpleName() + " ");
			
			if(pet instanceof Pet) counter.count("Pet");
			if(pet instanceof Dog) counter.count("Dog");
			if(pet instanceof Mutt) counter.count("Mutt");
			if(pet instanceof Pug) counter.count("Pug");
			if(pet instanceof Cat) counter.count("Cat");
			if(pet instanceof EgyptianMau) counter.count("EgyptianMau");
			if(pet instanceof Manx) counter.count("Manx");
			if(pet instanceof Cymric) counter.count("Cymric");
			if(pet instanceof Rodent) counter.count("Rodent");
			if(pet instanceof Rat) counter.count("Rat");
			if(pet instanceof Mouse) counter.count("Mouse");
			if(pet instanceof Hamster) counter.count("Hamster");
		}
		
		print();
		print(counter);
		
	}
	
	public static void main(String[] args) {
		countPets(new ForNameCreator());
		countPets(new LiteralPetCreator());
	}
	
	
	static class PetCounter extends HashMap<String, Integer> {
		
		private static final long serialVersionUID = 1L;

		public void count(String type){
			Integer quantity = get(type);
			if(quantity == null){
				put(type, 1);
			} else {
				put(type, quantity + 1);
			}
		}
	}
	
	

}
