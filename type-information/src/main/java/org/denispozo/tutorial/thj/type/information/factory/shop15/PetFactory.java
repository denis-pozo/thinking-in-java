package org.denispozo.tutorial.thj.type.information.factory.shop15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.denispozo.tutorial.thj.type.information.factory.shop15.Factory;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Cat;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Cymric;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Dog;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.EgyptianMau;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Gerbil;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Hamster;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Manx;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Mouse;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Mutt;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Pet;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Pug;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Rat;
import org.denispozo.tutorial.thj.type.information.factory.shop15.pet.Rodent;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Exercise 15
 */

//Façade to set a default PetCreator, in this case the one using literals
public class PetFactory {
	
	private static Random rand = new Random();
	
	static List<Factory<? extends Pet>> petFactories = 
			new ArrayList<Factory<? extends Pet>>();
	
	static{
		petFactories.add(new Pet.Factory());
		petFactories.add(new Cat.Factory());
		petFactories.add(new Cymric.Factory());
		petFactories.add(new Dog.Factory());
		petFactories.add(new EgyptianMau.Factory());
		petFactories.add(new Gerbil.Factory());
		petFactories.add(new Hamster.Factory());
		petFactories.add(new Manx.Factory());
		petFactories.add(new Mouse.Factory());
		petFactories.add(new Mutt.Factory());
		petFactories.add(new Pug.Factory());
		petFactories.add(new Rat.Factory());
		petFactories.add(new Rodent.Factory());
		petFactories.add(new Mutt.Factory());
		petFactories.add(new Cat.Factory());
	}
	
	public static Pet createRandom() {
		int n = rand.nextInt(petFactories.size());
		return petFactories.get(n).create();
	}
	
	public String toString() {
		return getClass().getSimpleName();
	}

}
